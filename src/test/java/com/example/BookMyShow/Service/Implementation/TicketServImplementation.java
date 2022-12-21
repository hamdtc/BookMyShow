package com.example.BookMyShow.Service.Implementation;

import com.example.BookMyShow.Converter.TicketConverter;
import com.example.BookMyShow.Dto.ResponseDto.TicketRespDto;
import com.example.BookMyShow.Dto.bookRequestDto;
import com.example.BookMyShow.Model.ShowEntity;
import com.example.BookMyShow.Model.ShowSeatsEntity;
import com.example.BookMyShow.Model.TicketEntity;
import com.example.BookMyShow.Model.UserEntity;
import com.example.BookMyShow.Repository.ShowRepository;
import com.example.BookMyShow.Repository.TicketRepository;
import com.example.BookMyShow.Repository.UserRepository;
import com.example.BookMyShow.Service.TicketService;
import com.example.BookMyShow.enums.SeatType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TicketServImplementation implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ShowRepository showRepository;


    @Override
    public TicketRespDto bookTicket(bookRequestDto bookRequestDto) {

        UserEntity userEntity=userRepository.findById(bookRequestDto.getId()).get();

        ShowEntity showEntity=showRepository.findById(bookRequestDto.getId()).get();



        Set<String> requestedSeats=bookRequestDto.getRequestedSeat();
        SeatType seatType=bookRequestDto.getSeatType();

        List<ShowSeatsEntity> availableSeats=showEntity.getSeats();
        Set<String> allowedSeats=new HashSet<>();

        List<ShowSeatsEntity> bookedSeats=new ArrayList<>();
        for(ShowSeatsEntity seat:availableSeats ){
            if(!seat.isBooked() && seat.getSeatType().equals(bookRequestDto.getSeatType())
                    && requestedSeats.contains(seat.getSeatNo()));
            bookedSeats.add(seat);
        }
        for(ShowSeatsEntity seat: bookedSeats) System.out.println(seat);
        if(bookedSeats.size() != requestedSeats.size())
            throw new Error ("Request all seats not Available try again");

        TicketEntity ticketEntity= TicketEntity.builder().user(userEntity).shows(showEntity).
              seats(bookedSeats).build();


        double amount=0;
        for(ShowSeatsEntity bookSeat: bookedSeats){
            bookSeat.setBooked(true);
            bookSeat.setBookedAt(new Date());
            bookSeat.setTicket(ticketEntity);

            amount+=bookSeat.getRate();
        }
        ticketEntity.setAmount(amount);
        ticketEntity.setAllotedSeats(convertListOfSeatsEntityToString(bookedSeats));

        ticketRepository.save(ticketEntity);
        return TicketConverter.entityToDto(ticketEntity);
    }
    public String convertListOfSeatsEntityToString(List<ShowSeatsEntity> bookedSeats){

        String str = "";
        for(ShowSeatsEntity showSeatsEntity : bookedSeats){

            str = str + showSeatsEntity.getSeatNo()+" ";
        }

        return str;

    }

    @Override
    public TicketRespDto getTicket(int id) {
        TicketEntity ticketEntity=ticketRepository.findById(id).get();
        TicketRespDto ticketRespDto=TicketConverter.entityToDto(ticketEntity);
        return ticketRespDto;
    }
}

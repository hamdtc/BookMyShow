package com.example.BookMyShow.Service.Implementation;

import com.example.BookMyShow.Converter.TicketConverter;
import com.example.BookMyShow.Dto.bookRequestDto;
import com.example.BookMyShow.Dto.ticketDto;
import com.example.BookMyShow.Model.ShowEntity;
import com.example.BookMyShow.Model.TicketEntity;
import com.example.BookMyShow.Model.UserEntity;
import com.example.BookMyShow.Repository.ShowRepository;
import com.example.BookMyShow.Repository.TicketRepository;
import com.example.BookMyShow.Repository.UserRepository;
import com.example.BookMyShow.Service.TicketService;
import com.example.BookMyShow.enums.SeatType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TicketServImplementation implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ShowRepository showRepository;


    @Override
    public ticketDto bookTicket(bookRequestDto bookRequestDto) {
        UserEntity userEntity=userRepository.findById(bookRequestDto.getId()).get();

        ShowEntity showEntity=showRepository.findById(bookRequestDto.getId()).get();

        Set<String> requestedSeats=bookRequestDto.getRequestedSeat();
        SeatType seatType=bookRequestDto.getSeatType();
    }

    @Override
    public bookRequestDto getTicket(int id) {
        TicketEntity ticketEntity=ticketRepository.findById(id).get();
        bookRequestDto ticketDto=TicketConverter.entityToDto(ticketEntity);
        return ticketDto;
    }
}

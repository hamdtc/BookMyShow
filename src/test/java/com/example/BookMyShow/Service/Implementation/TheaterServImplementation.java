package com.example.BookMyShow.Service.Implementation;

import com.example.BookMyShow.Converter.TheaterConverter;
import com.example.BookMyShow.Dto.TheaterDto;
import com.example.BookMyShow.Model.TheaterEntity;
import com.example.BookMyShow.Model.TheaterSeatEntity;
import com.example.BookMyShow.Repository.TheaterRepository;
import com.example.BookMyShow.Repository.TheaterSeatRepository;
import com.example.BookMyShow.Service.TheaterService;
import com.example.BookMyShow.enums.SeatType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterServImplementation implements TheaterService {

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    TheaterSeatRepository theaterSeatRepository;


    @Override
    public TheaterDto addTheater(TheaterDto theaterDto) {
        TheaterEntity theaterEntity= TheaterConverter.dtoToEntity(theaterDto);

        List<TheaterSeatEntity> seats= createTheaterSeats();
        for(TheaterSeatEntity seat: seats)
            //theaterRepository.save(seats);
            seat.setTheater(theaterEntity);

        theaterRepository.save(theaterEntity);
        return theaterDto;
    }
    public List<TheaterSeatEntity> createTheaterSeats(){

        List<TheaterSeatEntity> seats=new ArrayList<>();
        seats.add(getTheaterSeat("B111",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("B112",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("B113",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("B114",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("B115",100,SeatType.CLASSIC));

        seats.add(getTheaterSeat("A001",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("A002",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("A003",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("A004",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("A005",200,SeatType.PREMIUM));

        theaterSeatRepository.saveAll(seats);
        return seats;
    }

    public TheaterSeatEntity getTheaterSeat(String seatNo, int rate, SeatType seatType) {
        return TheaterSeatEntity.builder().seatNo(seatNo).rate(rate).seatType(seatType).build();
    }

    @Override
    public TheaterDto getTheater(int id) {
        return null;
    }
}

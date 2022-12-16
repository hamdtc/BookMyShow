package com.example.BookMyShow.Service.Implementation;

import com.example.BookMyShow.Converter.ShowConverter;
import com.example.BookMyShow.Dto.ShowDto;
import com.example.BookMyShow.Model.*;
import com.example.BookMyShow.Repository.MovieRepository;
import com.example.BookMyShow.Repository.ShowRepository;
import com.example.BookMyShow.Repository.TheaterRepository;
import com.example.BookMyShow.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowServImplementation implements ShowService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    ShowRepository showRepository;

    @Override
    public ShowDto addShow(ShowDto showDto) {
        ShowEntity showEntity= ShowConverter.dtoToEntity(showDto);

        MovieEntity movieEntity=movieRepository.findById(showDto.getMovieDto().getId()).get();
        showEntity.setMovie(movieEntity);

        TheaterEntity theaterEntity=theaterRepository.findById(showDto.getTheaterDto().getId()).get();
        showEntity.setTheater(theaterEntity);

        List<ShowSeatsEntity> seats=createShowSeats(theaterEntity.getSeats(),showEntity);

        showRepository.save(showEntity);
        return showDto;
    }
    //create copy of seat to a show
    public List<ShowSeatsEntity> createShowSeats(List<TheaterSeatEntity> theaterSeat,ShowEntity show){

        List<ShowSeatsEntity> seats=new ArrayList<>();
        for(TheaterSeatEntity seat: theaterSeat){
            ShowSeatsEntity showSeats= ShowSeatsEntity.builder().id(seat.getId()).seatNo(seat.getSeatNo())
                    .seatType(seat.getSeatType()).booked(false).show(show).build();
            seats.add(showSeats);
        }
        return seats;
    }

    @Override
    public ShowDto getShow(int id) {
        ShowEntity showEntity=showRepository.findById(id).get();
        ShowDto showDto=ShowConverter.entityToDto(showEntity);
        return showDto;

    }
}
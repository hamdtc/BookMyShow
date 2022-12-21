package com.example.BookMyShow.Service.Implementation;

import com.example.BookMyShow.Converter.ShowConverter;
import com.example.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.ShowRespDto;
import com.example.BookMyShow.Model.*;
import com.example.BookMyShow.Repository.MovieRepository;
import com.example.BookMyShow.Repository.ShowRepository;
import com.example.BookMyShow.Repository.ShowSeatsRepository;
import com.example.BookMyShow.Repository.TheaterRepository;
import com.example.BookMyShow.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
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
    @Autowired
    ShowSeatsRepository showSeatsRepository;


    @Override
    public ShowRespDto addShow(ShowEntryDto showEntryDto) {
        ShowEntity showEntity= ShowConverter.dtoToEntity(showEntryDto);

        //MovieEntity
        MovieEntity movieEntity = movieRepository.findById(showEntryDto.getMovieResponseDto().getId()).get();

        TheaterEntity theaterEntity = theaterRepository.findById(showEntryDto.getTheaterResponseDto().getId()).get();


        showEntity.setMovie(movieEntity); //Why are we setting these varibble
        showEntity.setTheater(theaterEntity);

        showEntity = showRepository.save(showEntity);


        //We need to pass the list of the theater seats
        List<ShowSeatsEntity> showSeatsEntityList = generateShowEntitySeats(theaterEntity.getSeats(),showEntity);
        showSeatsRepository.saveAll(showSeatsEntityList);
        //We need to create Response Show Dto.

        ShowRespDto showRespDto = ShowConverter.entityToDto(showEntity,showEntryDto);

        return showRespDto;
    }
    //create copy of seat to a show

    public List<ShowSeatsEntity> generateShowEntitySeats(List<TheaterSeatEntity> theaterSeatsEntityList,ShowEntity showEntity){

        List<ShowSeatsEntity> showSeatsEntityList = new ArrayList<>();

        //log.info(String.valueOf(theaterSeatsEntityList));
//        log.info("The list of theaterEntity Seats");
//        for(TheaterSeatsEntity tse: theaterSeatsEntityList){
//            log.info(tse.toString());
//        }


        for(TheaterSeatEntity tse : theaterSeatsEntityList){

            ShowSeatsEntity showSeatsEntity = ShowSeatsEntity.builder().seatNo(tse.getSeatNo())
                    .seatType(tse.getSeatType())
                    .rate(tse.getRate())
                    .build();

            showSeatsEntityList.add(showSeatsEntity);
        }


        //We need to set the show Entity for each of the ShowSeat....
        for(ShowSeatsEntity showSeatsEntity:showSeatsEntityList){
            showSeatsEntity.setShow(showEntity);
        }

        showEntity.setSeats(showSeatsEntityList);
        return showSeatsEntityList;

    }

    @Override
    public ShowRespDto getShow(int id) {
        ShowEntity showEntity=showRepository.findById(id).get();

        ShowEntryDto showEntryDto = null;
        ShowRespDto showRespDto=ShowConverter.entityToDto(showEntity,showEntryDto);
        return showRespDto;

    }
}
package com.example.BookMyShow.Controller;

import com.example.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.MovieNameAndIdObject;
import com.example.BookMyShow.Dto.ResponseDto.MovieRespDto;
import com.example.BookMyShow.Service.Implementation.MovieServImplementation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("movie")
public class MovieController {


    @Autowired
    MovieServImplementation movieService;


    @PostMapping("/add")
    public MovieRespDto addMovie(@RequestBody() MovieEntryDto movieEntryDto){

        MovieRespDto movieResponseDto = movieService.addMovie(movieEntryDto);

        log.info("The movieResponseDto is ",movieResponseDto);
        return movieResponseDto;

    }

    @GetMapping("/get/{id}")
    public MovieNameAndIdObject getNameAndId(@PathVariable Integer id){

        MovieNameAndIdObject movieNameAndIdObject = movieService.getNameAndId(id);

        return movieNameAndIdObject;
    }

}

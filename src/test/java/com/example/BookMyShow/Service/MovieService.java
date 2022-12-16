package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.MovieDto;
import lombok.Builder;


public interface MovieService {

    //add
    public MovieDto addMovie(MovieDto movieDto);


    //get
    public MovieDto getMovie(int id);
}

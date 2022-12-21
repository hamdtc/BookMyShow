package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.MovieNameAndIdObject;
import com.example.BookMyShow.Dto.ResponseDto.MovieRespDto;


public interface MovieService {

    //add

   public MovieRespDto addMovie(MovieEntryDto movieEntryDto);

    //get
    public MovieRespDto getMovie(int id);

    MovieNameAndIdObject getNameAndId(int id);
}

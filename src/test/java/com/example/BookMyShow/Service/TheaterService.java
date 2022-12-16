package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.TheaterDto;
import com.example.BookMyShow.Model.TheaterEntity;

public interface TheaterService {

    //add
    public TheaterDto addTheater(TheaterDto theaterDto);

    //get
    public TheaterDto getTheater(int id);
}

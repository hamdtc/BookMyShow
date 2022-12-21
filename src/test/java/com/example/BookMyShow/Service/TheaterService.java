package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.TheaterRespDto;

public interface TheaterService {

    //add
    public TheaterRespDto addTheater(TheaterEntryDto theaterEntryDto);

    //get
    public TheaterRespDto getTheater(int id);
}

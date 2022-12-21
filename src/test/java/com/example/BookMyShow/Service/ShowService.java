package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.ShowRespDto;

public interface ShowService {
    //add
   public ShowRespDto addShow(ShowEntryDto showEntryDto);


    //get
   public ShowRespDto getShow(int id);
}

package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.ShowDto;

public interface ShowService {
    //add
   public ShowDto addShow(ShowDto showDto);


    //get
   public ShowDto getShow(int id);
}

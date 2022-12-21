package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.UserRespDto;

public interface UserService {
    //add
    void addUser(UserEntryDto userEntryDto);

    //get
    public UserRespDto getUser(int id);
}

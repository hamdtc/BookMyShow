package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.TheaterRespDto;
import com.example.BookMyShow.Model.TheaterEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheaterConverter {


    public TheaterEntity dtoToEntity(TheaterEntryDto theaterEntryDto){
        return TheaterEntity.builder().name(theaterEntryDto.getName()).city(theaterEntryDto.getCity())
                .address(theaterEntryDto.getAddress()).build();
    }

    public TheaterRespDto entityToDto(TheaterEntity theaterEntity){
        return TheaterRespDto.builder().id(theaterEntity.getId()).city(theaterEntity.getCity())
                .Address(theaterEntity.getAddress()).name(theaterEntity.getName()).type(theaterEntity.getType())
                .build();

    }
}

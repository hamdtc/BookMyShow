package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.TheaterDto;
import com.example.BookMyShow.Model.TheaterEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheaterConverter {


    public TheaterEntity dtoToEntity(TheaterDto theaterDto){
        return TheaterEntity.builder().name(theaterDto.getName()).city(theaterDto.getCity())
                .address(theaterDto.getAddress()).build();
    }

    public TheaterDto entityToDto(TheaterEntity theaterEntity){
        return null;

    }
}

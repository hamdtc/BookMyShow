package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.MovieNameAndIdObject;
import com.example.BookMyShow.Dto.ResponseDto.MovieRespDto;
import com.example.BookMyShow.Model.MovieEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConverter {

    public static MovieEntity dtoToEntity(MovieEntryDto movieEntryDto){

        return MovieEntity.builder() //.attribute (value)
                .name(movieEntryDto.getName())
                .releaseDate(movieEntryDto.getReleaseDate()).build();

    }


    public static MovieRespDto entityToDto(MovieEntity movieEntity){

        return MovieRespDto.builder().id(movieEntity.getId()).releaseDate(movieEntity
                .getReleaseDate()).name(movieEntity.getName()).build();
    }
    public static MovieNameAndIdObject convertEntityToThisObject(MovieEntity movieEntity){


        return MovieNameAndIdObject.builder().
                id(movieEntity.getId())
                .name(movieEntity.getName()).build();

    }
}

package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.ShowRespDto;
import com.example.BookMyShow.Model.ShowEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShowConverter {

    public static ShowEntity dtoToEntity(ShowEntryDto showEntryDto){
        return ShowEntity.builder().showTime(showEntryDto.getShowTime()).showDate(showEntryDto.getShowDate())
                .build();


    }
    public static ShowRespDto entityToDto(ShowEntity showEntity,ShowEntryDto showEntryDto) {
        return ShowRespDto.builder().showTime(showEntity.getShowTime()).
                showDate(showEntity.getShowDate()).id(showEntity.getId()).
                movieRespDto(showEntryDto.getMovieResponseDto()).theaterRespDto(showEntryDto.getTheaterResponseDto())
                .build();
    }
}

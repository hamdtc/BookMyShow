package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.ShowDto;
import com.example.BookMyShow.Model.ShowEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShowConverter {

    public static ShowEntity dtoToEntity(ShowDto showDto){
        return ShowEntity.builder().showTime(showDto.getShowTime()).showDate(showDto.getShowDate())
                .id(showDto.getId()).build();


    }
    public static ShowDto entityToDto(ShowEntity showEntity) {
        return ShowDto.builder().showTime(showEntity.getShowTime()).showDate(showEntity.getShowDate())
                .build();
    }
}

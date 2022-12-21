package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.UserRespDto;
import com.example.BookMyShow.Model.UserEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {

        public static UserEntity dtoToEntity(UserEntryDto userDto){

            return UserEntity.builder().name(userDto.getName()).mobile(userDto.getMobile()).build();
        }

        public static UserRespDto entityToDto(UserEntity userEntity){

            return UserRespDto.builder().id(userEntity.getId()).name(userEntity.getName()).mobile(userEntity.getMobile()).build();

        }

}

package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.UserDto;
import com.example.BookMyShow.Model.UserEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {

        public static UserEntity dtoToEntity(UserDto userDto){

            return UserEntity.builder().name(userDto.getName()).mobile(userDto.getMobile()).build();
        }

        public static UserDto entityToDto(UserEntity userEntity){

            return UserDto.builder().name(userEntity.getName()).mobile(userEntity.getMobile()).build();

        }

}

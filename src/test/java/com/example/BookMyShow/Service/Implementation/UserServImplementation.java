package com.example.BookMyShow.Service.Implementation;

import com.example.BookMyShow.Converter.UserConverter;
import com.example.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.example.BookMyShow.Dto.ResponseDto.UserRespDto;
import com.example.BookMyShow.Model.UserEntity;
import com.example.BookMyShow.Repository.UserRepository;
import com.example.BookMyShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServImplementation implements UserService {
        @Autowired
        UserRepository userRepository;

        @Override
        public void addUser(UserEntryDto userEntryDto){

            UserEntity userEntity = UserConverter.dtoToEntity(userEntryDto);
            userRepository.save(userEntity);
        }

        @Override
        public UserRespDto getUser(int id){

            UserEntity userEntity = userRepository.findById(id).get();
            UserRespDto userRespDto = UserConverter.entityToDto(userEntity);
            return userRespDto;
        }
}

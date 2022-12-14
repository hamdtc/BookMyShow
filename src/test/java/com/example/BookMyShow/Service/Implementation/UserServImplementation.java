package com.example.BookMyShow.Service.Implementation;

import com.example.BookMyShow.Converter.UserConverter;
import com.example.BookMyShow.Dto.UserDto;
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
        public void addUser(UserDto userDto){

            UserEntity userEntity = UserConverter.dtoToEntity(userDto);
            userRepository.save(userEntity);
        }

        @Override
        public UserDto getUser(int id){

            UserEntity userEntity = userRepository.findById(id).get();
            UserDto userDto = UserConverter.entityToDto(userEntity);
            return userDto;
        }
}

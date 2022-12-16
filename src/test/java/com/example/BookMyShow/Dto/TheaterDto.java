package com.example.BookMyShow.Dto;

import com.example.BookMyShow.Service.Implementation.TheaterServImplementation;
import com.example.BookMyShow.enums.TheaterType;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheaterDto {

    private int id;
    @NonNull
    private String name;
    @NonNull
    private String city;

    private String Address;

    ShowDto showDto;
}

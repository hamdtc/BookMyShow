package com.example.BookMyShow.Dto.ResponseDto;

import com.example.BookMyShow.Service.Implementation.TheaterServImplementation;
import com.example.BookMyShow.enums.TheaterType;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheaterRespDto {

    private int id;
    @NonNull
    private String name;
    @NonNull
    private String city;

    private String Address;

    private TheaterType type;
    //ShowDto showDto;
}

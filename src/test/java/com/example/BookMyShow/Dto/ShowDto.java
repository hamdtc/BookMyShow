package com.example.BookMyShow.Dto;

import com.example.BookMyShow.enums.TheaterType;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ShowDto {

    private int id;
    private LocalDate showDate;
    private LocalTime showTime;
    private MovieDto movieDto;
    private TheaterDto theaterDto;

}

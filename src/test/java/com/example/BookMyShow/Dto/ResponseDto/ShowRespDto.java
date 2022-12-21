package com.example.BookMyShow.Dto.ResponseDto;

import com.sun.istack.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Builder

public class ShowRespDto {
    int id;
    @NotNull
    LocalDate showDate;

    @NotNull
    LocalTime showTime;

    @NotNull
    MovieRespDto movieRespDto;

    @NotNull
    TheaterRespDto theaterRespDto;

}

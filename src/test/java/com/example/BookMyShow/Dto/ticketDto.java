package com.example.BookMyShow.Dto;

import com.example.BookMyShow.Dto.ResponseDto.ShowDto;
import com.example.BookMyShow.Dto.ResponseDto.UserRespDto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ticketDto {

    private int id;

    private String allotedSeats;
    private double amount;

    private ShowDto showDto;

    @NonNull
    private UserRespDto userDto;

}

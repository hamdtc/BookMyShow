package com.example.BookMyShow.Dto.ResponseDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketRespDto {

    private int id;
    private String allotedSeats;
    private double amount;
}

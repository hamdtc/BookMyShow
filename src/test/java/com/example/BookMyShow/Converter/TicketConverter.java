package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.bookRequestDto;
import com.example.BookMyShow.Model.TicketEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TicketConverter {

    public TicketEntity dtoToEntity(bookRequestDto ticketDto){
        return TicketEntity.builder().allotedSeats(ticketDto.getAllotedSeats()).amount(ticketDto.getAmount())
                .bookedAt(ticketDto.getBookedAt()).build();

    }
    public bookRequestDto entityToDto(TicketEntity ticketEntity){
        return bookRequestDto.builder().id(ticketEntity.getId()).allotedSeats(ticketEntity.getAllotedSeats())
                .amount(ticketEntity.getAmount()).bookedAt(ticketEntity.getBookedAt()).build();
    }
}

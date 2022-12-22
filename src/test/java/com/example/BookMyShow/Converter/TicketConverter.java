package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.ResponseDto.TicketRespDto;
import com.example.BookMyShow.Dto.bookRequestDto;
import com.example.BookMyShow.Model.TicketEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TicketConverter {

    public static TicketEntity dtoToEntity(bookRequestDto ticketDto){
        return null;

    }
    public static TicketRespDto entityToDto(TicketEntity ticketEntity){
        return TicketRespDto.builder().id(ticketEntity.getId()).allotedSeats(ticketEntity.getAllottedSeats())
                .amount(ticketEntity.getAmount()).build();
    }
}

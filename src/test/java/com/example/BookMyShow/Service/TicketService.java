package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.ResponseDto.TicketRespDto;
import com.example.BookMyShow.Dto.bookRequestDto;

public interface TicketService {

    //add
    public TicketRespDto bookTicket(bookRequestDto ticketDto);


    //get
    public TicketRespDto getTicket(int id);
}

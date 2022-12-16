package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.bookRequestDto;
import com.example.BookMyShow.Dto.ticketDto;

public interface TicketService {

    //add
    public ticketDto bookTicket(bookRequestDto ticketDto);


    //get
    public bookRequestDto getTicket(int id);
}

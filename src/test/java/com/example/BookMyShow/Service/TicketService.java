package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.bookRequestDto;

public interface TicketService {

    //add
    public bookRequestDto bookTicket(bookRequestDto ticketDto);


    //get
    public bookRequestDto getTicket(int id);
}

package com.example.BookMyShow.Controller;

import com.example.BookMyShow.Dto.ResponseDto.TicketRespDto;
import com.example.BookMyShow.Dto.bookRequestDto;
import com.example.BookMyShow.Service.Implementation.TicketServImplementation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    TicketServImplementation ticketService;

    @GetMapping("get/{id}")
    public TicketRespDto getTicketById(@PathVariable Integer id){

        return ticketService.getTicket(id);
    }

    @PostMapping("/add")
    public TicketRespDto addTicket(@RequestBody() bookRequestDto bookTicketRequestDto){


        log.info("In controller");
        return ticketService.bookTicket(bookTicketRequestDto);

    }
}

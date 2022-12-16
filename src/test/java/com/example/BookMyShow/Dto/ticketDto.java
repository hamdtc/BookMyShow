package com.example.BookMyShow.Dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ticketDto {

    private int id;

    private Set<String> allotedSeats;
    private double amount;

    private ShowDto showDto;
    private UserDto userDto;

}

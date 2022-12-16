package com.example.BookMyShow.Dto;

import com.example.BookMyShow.enums.SeatType;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class bookRequestDto {

    private int id;
    private int showId;
    private SeatType seatType;

    private Set<String> requestedSeat;
}

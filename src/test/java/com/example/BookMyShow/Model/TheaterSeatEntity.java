package com.example.BookMyShow.Model;

import com.example.BookMyShow.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "theater_seats")
public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "seat_number",nullable = false)
    private String seatNo;

    @Column(name = "rate",nullable = false)
    private int rate;

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type",nullable = false)
    private SeatType seatType;

    @ManyToOne
    @JsonIgnore
    @JoinColumn
    private TheaterEntity theater;
}

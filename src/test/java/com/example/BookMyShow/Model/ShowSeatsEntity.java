package com.example.BookMyShow.Model;

import com.example.BookMyShow.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "show_seats")
public class ShowSeatsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "seat_number", nullable = false)
    private String seatNo;

    @Column(name = "rate", nullable = false)
    private int rate;

    @Column(name = "seat_type", nullable = false)
    private SeatType seatType;

    private Boolean booked;

    @Column(name = "booked_at")
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private ShowEntity show;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private TicketEntity ticket;
}

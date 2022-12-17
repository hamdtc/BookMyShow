package com.example.BookMyShow.Model;

import com.example.BookMyShow.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "show_seats")
public class ShowSeatsEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "seat_number", nullable = false)
    private String seatNo;

    @Column(name = "rate", nullable = false)
    private int rate;

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type", nullable = false)
    private SeatType seatType;

    @Column(name = "is_booked", columnDefinition = "bit(1) default 0", nullable = false)
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

    public boolean isBooked() {
        return booked;
    }
}

package com.example.BookMyShow.Model;

import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "alloted_seats",nullable = false)
    private String allotedSeats;

    @Column(name = "amount",nullable = false)
    private double amount;

    @Column(name = "booked_at",nullable = false)
    private LocalDate bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    UserEntity user;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    ShowEntity shows;


}

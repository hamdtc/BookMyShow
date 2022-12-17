package com.example.BookMyShow.Model;

import lombok.*;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.nio.MappedByteBuffer;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
    private Set<String> allotedSeats;

    @Column(name = "amount",nullable = false)
    private double amount;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "booked_at",nullable = false)
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    UserEntity user;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    ShowEntity shows;


    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity> seats;
}

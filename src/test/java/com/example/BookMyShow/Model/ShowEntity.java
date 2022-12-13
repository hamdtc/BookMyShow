package com.example.BookMyShow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date showDate;
    private Time showTime;
    @UpdateTimestamp
    private Date createAt;

    @UpdateTimestamp
    private Date updateAt;


    @ManyToOne
    @JsonIgnore
    private TheaterEntity theater;

    @OneToMany( cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TicketEntity> tickets;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatsEntity> seats;
}

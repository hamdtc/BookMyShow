package com.example.BookMyShow.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Enum seatType;
    private String name;
    private String address;
    private String city;

    @OneToMany(cascade=CascadeType.ALL)
    List<ShowEntity> showsList;

    @OneToMany(cascade=CascadeType.ALL)
    List<TheaterSeatEntity> theaterSeatEntities;
}

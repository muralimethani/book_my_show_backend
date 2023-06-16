package com.example.book_my_show_backend.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "theater")
@Data

public class TheaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String city;

    private String address;



    // List of theater seats
    @OneToMany(mappedBy = "theater", cascade =CascadeType.ALL)
    List<TheaterSeatEntity> theaterSeatEntityList;

    // lists of shows
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    List<ShowEntity> listOfShows;

}

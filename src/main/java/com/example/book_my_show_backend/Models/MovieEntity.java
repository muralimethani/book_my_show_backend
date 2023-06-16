package com.example.book_my_show_backend.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="movies")
@Data
@NoArgsConstructor
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String movieName;

    private int duration;

    private Date releaseDate;

    @OneToMany(mappedBy = "movieEntity", cascade =CascadeType.ALL)
    private List<ShowEntity> listOfShows;
}

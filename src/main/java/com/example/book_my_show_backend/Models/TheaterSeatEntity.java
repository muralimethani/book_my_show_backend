package com.example.book_my_show_backend.Models;

import com.example.book_my_show_backend.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theater_seats")
@Data
@NoArgsConstructor
public class TheaterSeatEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "seat_no", nullable = false)
    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    SeatType seatType;

    private int rate;

    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;


}

package com.example.book_my_show_backend.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shows")
@Data
@NoArgsConstructor
public class ShowEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private LocalDate  showDate;

    private LocalDate showTime;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    @ManyToOne
    @JoinColumn
    private MovieEntity movieEntity;

    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;

    @OneToMany(mappedBy = "showEntity", cascade = CascadeType.ALL)
    List<ShowSeatEntity> listOfSeats;

    @OneToMany(mappedBy ="show", cascade = CascadeType.ALL)
    private List<TicketEntity>listOfTickets;




}

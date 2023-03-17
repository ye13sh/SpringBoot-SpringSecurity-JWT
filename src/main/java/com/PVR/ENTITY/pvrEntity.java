package com.PVR.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="pvr")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class pvrEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Theater_No",nullable = false,updatable = true)
    String TheaterNo;
    @Column(name="Movie_Name",nullable = false)
    String movieName;
    @Column(name="Seat_No",nullable = false)
    String seatNo;
    @Column(name="Show_Time",nullable = false)
    String ShowTime;
    @Column(name = "Show_Date",nullable = false)
    String showDate;
    @Column(name="place",nullable = false)
    String place;




}

package com.PVR.ENTITY;

import jakarta.persistence.*;


@Entity
@Table(name="pvr")
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

    public String getTheaterNo() {
        return TheaterNo;
    }

    public void setTheaterNo(String theaterNo) {
        TheaterNo = theaterNo;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getShowTime() {
        return ShowTime;
    }

    public void setShowTime(String showTime) {
        ShowTime = showTime;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


}

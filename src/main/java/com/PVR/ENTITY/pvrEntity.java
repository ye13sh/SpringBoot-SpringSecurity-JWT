package com.PVR.ENTITY;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pvr")
public class pvrEntity {
    @Id
    @Column(name="Theater_No")
    String TheaterNo;
    @Column(name="Movie_Name")
    String movieName;
    @Column(name="Seat_No")
    String seatNo;
    @Column(name="Show_Time")
    String ShowTime;
    @Column(name = "Show_Date")
    String showDate;
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

    @Override
    public String toString() {
        return "pvrEntity{" +
                "TheaterNo='" + TheaterNo + '\'' +
                ", movieName='" + movieName + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", ShowTime='" + ShowTime + '\'' +
                ", showDate='" + showDate + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}

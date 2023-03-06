package com.PVR.DTO;

public class pvrDTO {
    String TheaterNo;
    String movieName;
    String seatNo;
    String ShowTime;
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
        return "pvrDTO{" +
                "TheaterNo='" + TheaterNo + '\'' +
                ", movieName='" + movieName + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", ShowTime='" + ShowTime + '\'' +
                ", showDate='" + showDate + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}

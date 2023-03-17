package com.PVR.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class pvrDTO {
    String TheaterNo;
    String movieName;
    String seatNo;
    String ShowTime;
    String showDate;
    String place;


}

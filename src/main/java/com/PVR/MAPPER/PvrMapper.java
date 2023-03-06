package com.PVR.MAPPER;

import com.PVR.DTO.pvrDTO;
import com.PVR.ENTITY.pvrEntity;
import org.springframework.stereotype.Component;

@Component
public class PvrMapper {
    public pvrEntity penitiy(pvrDTO dto){
        pvrEntity entity=new pvrEntity();

        entity.setTheaterNo(dto.getTheaterNo());
        entity.setMovieName(dto.getMovieName());
        entity.setSeatNo(dto.getSeatNo());
        entity.setShowTime(dto.getShowTime());
        entity.setShowDate(dto.getShowDate());
        entity.setPlace(dto.getPlace());

        return entity;
    }

    public pvrDTO pDto(pvrEntity entity){
        pvrDTO dto=new pvrDTO();

        dto.setTheaterNo(entity.getTheaterNo());
        dto.setMovieName(entity.getMovieName());
        dto.setSeatNo(entity.getSeatNo());
        dto.setShowTime(entity.getShowTime());
        dto.setShowDate(entity.getShowDate());
        dto.setPlace(entity.getPlace());

        return dto;
    }
}

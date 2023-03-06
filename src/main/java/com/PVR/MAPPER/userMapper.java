package com.PVR.MAPPER;

import com.PVR.DTO.userDTO;
import com.PVR.ENTITY.userEntity;
import org.springframework.stereotype.Component;

@Component
public class userMapper {
    public userEntity uEntity(userDTO uDto){
        userEntity entity=new userEntity();

        entity.setUsername(uDto.getUsername());
        entity.setPassword(uDto.getPassword());
        entity.setName(uDto.getName());
        entity.setDOB(uDto.getDOB());
        entity.setEmail(uDto.getEmail());
        entity.setMobile(uDto.getMobile());

        return entity;
    }

    public userDTO uDTO(userEntity entity){
        userDTO dto=new userDTO();

        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setName(entity.getName());
        dto.setDOB(entity.getDOB());
        dto.setEmail(entity.getEmail());
        dto.setMobile(entity.getMobile());

        return dto;
    }
}

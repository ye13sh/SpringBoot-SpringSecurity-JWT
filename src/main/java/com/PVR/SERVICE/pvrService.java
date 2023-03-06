package com.PVR.SERVICE;

import com.PVR.DTO.pvrDTO;
import com.PVR.DTO.userDTO;
import com.PVR.MAPPER.PvrMapper;
import com.PVR.MAPPER.userMapper;
import com.PVR.REPOSITORY.pvrRepository;
import com.PVR.REPOSITORY.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class pvrService {
    @Autowired
    private pvrRepository prepo;
    @Autowired
    private userRepository repository;
    @Autowired
    private PvrMapper pmapper;
    @Autowired
    private userMapper mapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public pvrDTO InsertTicket(pvrDTO pDTO){
        return pmapper.pDto(prepo.save(pmapper.penitiy(pDTO)));
    }

    public pvrDTO GetTicketByID(int id){
        return pmapper.pDto(prepo.getReferenceById(id));
    }

    public pvrDTO UpdateTicketByID(int id){
        return pmapper.pDto(prepo.getReferenceById(id));
    }
    public pvrDTO DeleteTicketByID(int id){
        return pmapper.pDto(prepo.getReferenceById(id));
    }

    public userDTO InsertUser(userDTO dto){
        return mapper.uDTO(repository.save(mapper.uEntity(dto)));
    }
    public userDTO GetUserByID(int id){
        return mapper.uDTO(repository.getReferenceById(id));
    }
    public userDTO UpdateUserByID(int id){
        return mapper.uDTO(repository.getReferenceById(id));
    }
    public userDTO DeleteUserByID(int id){
        return mapper.uDTO(repository.getReferenceById(id));
    }

    public userDTO addUser(userDTO dto){
         dto.setPassword(passwordEncoder.encode(dto.getPassword()));
         return mapper.uDTO(repository.save(mapper.uEntity(dto)));
    }
}

package com.PVR.REPOSITORY;

import com.PVR.ENTITY.pvrEntity;
import com.PVR.ENTITY.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<userEntity,Integer> {

}

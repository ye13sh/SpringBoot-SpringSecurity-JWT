package com.PVR.REPOSITORY;

import com.PVR.ENTITY.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userEntity,Integer> {

}

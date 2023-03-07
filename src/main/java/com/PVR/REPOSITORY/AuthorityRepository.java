package com.PVR.REPOSITORY;

import com.PVR.ENTITY.authorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<authorityEntity,Integer> {
    Optional<authorityEntity> findByName(String username);
}

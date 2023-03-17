package com.PVR.REPOSITORY;

import com.PVR.ENTITY.authorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AuthorityRepository extends JpaRepository<authorityEntity,Integer> {
    Optional<authorityEntity> findByName(String username);
}

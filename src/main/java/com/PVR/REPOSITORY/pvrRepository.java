package com.PVR.REPOSITORY;

import com.PVR.ENTITY.pvrEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface pvrRepository extends JpaRepository<pvrEntity,Integer> {
}

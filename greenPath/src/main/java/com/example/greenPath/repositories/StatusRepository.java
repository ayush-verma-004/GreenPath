package com.example.greenPath.repositories;

import com.example.greenPath.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusRepository extends JpaRepository<Status, Long> {
    List<Status> findByCropId(Long cropId);
}
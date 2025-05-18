package com.example.greenPath.repositories;

import com.example.greenPath.entities.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropRepository extends JpaRepository<Crop, Long> {}

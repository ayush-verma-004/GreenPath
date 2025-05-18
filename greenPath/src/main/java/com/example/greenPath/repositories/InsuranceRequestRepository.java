package com.example.greenPath.repositories;

import com.example.greenPath.entities.InsuranceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRequestRepository extends JpaRepository<InsuranceRequest, Long> {}
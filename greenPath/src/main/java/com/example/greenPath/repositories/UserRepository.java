package com.example.greenPath.repositories;

import com.example.greenPath.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
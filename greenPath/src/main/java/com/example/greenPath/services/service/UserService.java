package com.example.greenPath.services.service;

import com.example.greenPath.dto.request.SignupRequest;
import org.springframework.stereotype.Service;


public interface UserService {

    void save(SignupRequest signupRequest);

}

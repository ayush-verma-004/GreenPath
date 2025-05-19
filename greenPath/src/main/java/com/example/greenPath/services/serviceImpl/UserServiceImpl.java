package com.example.greenPath.services.serviceImpl;

import com.example.greenPath.dto.request.SignupRequest;
import com.example.greenPath.entities.User;
import com.example.greenPath.repositories.UserRepository;
import com.example.greenPath.services.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(SignupRequest signupRequest) {
        User user = new User();
        user.setUsername(signupRequest.getUsername());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setLocation(signupRequest.getLocation());
        user.setPersonal(signupRequest.getPersonal());
        user.setBank(signupRequest.getBank());
        user.setLand(signupRequest.getLand());
        userRepository.save(user);
    }
}

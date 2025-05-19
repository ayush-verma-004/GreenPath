package com.example.greenPath.controllers;


import com.example.greenPath.dto.request.SignupRequest;
import com.example.greenPath.services.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private  UserService userService;

    @PostMapping("/signup")
    public String signup(@Valid @RequestBody SignupRequest signupRequest){
        try{
            userService.save(signupRequest);
            return "done";
        }catch(Exception e){
            return "Error";
        }
    }
}

package com.example.greenPath.controllers;


import jakarta.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/api/farmer")
public class FarmerController {

    @PostMapping("/cropUpdate")
    public String cropUpdate(@Valid @RequestBody CropDto cropDto){
        try{
            return "You successfully update crop on your portal! ";
        }catch(Exception e){
            return "Your work get not successfully , please check it!";
        }
    }

    @PostMapping("/insurancePlans")
    public String insurancePlans(){
        try{
            return "Successfully insurance!";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

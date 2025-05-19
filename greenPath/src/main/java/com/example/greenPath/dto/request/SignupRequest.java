package com.example.greenPath.dto.request;

import com.example.greenPath.entities.BankDetails;
import com.example.greenPath.entities.LandDetails;
import com.example.greenPath.entities.PersonalDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {

    private String username;
    private String email;
    private String password;
    private String location;
    private PersonalDetails personal;
    private LandDetails land;
    private BankDetails bank;

}
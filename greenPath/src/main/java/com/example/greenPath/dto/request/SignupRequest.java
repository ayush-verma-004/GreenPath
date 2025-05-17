package com.example.greenPath.dto.request;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    private String username;
    private String email;
    private String password;
    private PersonalDetails personal;
    private LandDetails land;
    private BankDetails bank;
}
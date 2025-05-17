package com.example.greenPath.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalDetails {

    private String aadhaar;
    private String phone;
    private String fullName;
    private String guardianName;
    private String guardianRelation;
    private Integer age;
    private String caste;
    private String gender;
    private String type;
    private String category;
    private String address;
    private String pinCode;
    private String imageUrl;

}
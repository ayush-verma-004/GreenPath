package com.example.greenPath.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "farmers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String email;
    private String password;
    private String location;

    @Embedded
    private PersonalDetails personal;
    @Embedded
    private LandDetails land;
    @Embedded
    private BankDetails bank;

    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL)
    private List<Crop> crops;

}

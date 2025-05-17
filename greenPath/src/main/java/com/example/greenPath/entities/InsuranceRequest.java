package com.example.greenPath.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "insurance_requests")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceRequest {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false) @JoinColumn(name = "farmer_id")
    private User farmer;

    @ManyToOne(optional = false) @JoinColumn(name = "crop_id")
    private Crop crop;

    private String status;
    private BigDecimal claimAmount;
    private LocalDate requestedOn;

}

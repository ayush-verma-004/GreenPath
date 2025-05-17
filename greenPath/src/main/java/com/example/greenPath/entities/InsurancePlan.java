package com.example.greenPath.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "insurance_plans")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsurancePlan {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false) @JoinColumn(name = "farmer_id")
    private User farmer;

    @ManyToOne(optional = false) @JoinColumn(name = "crop_id")
    private Crop crop;

    private BigDecimal premium;
    private LocalDate validFrom;
    private LocalDate validUntil;

}
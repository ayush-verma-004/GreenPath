package com.example.greenPath.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "crops")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Crop {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false) @JoinColumn(name = "farmer_id")
    private User farmer;

    private String name;
    private String season;
    private String variety;
    private BigDecimal area;
    private BigDecimal expectedAmount;
    private String status;
    private String primaryImageUrl;
    private String secondaryImageUrl;

    @OneToMany(mappedBy = "crop", cascade = CascadeType.ALL)
    private List<InsurancePlan> insurancePlans;

    @OneToMany(mappedBy = "crop", cascade = CascadeType.ALL)
    private List<InsuranceRequest> insuranceRequests;

    @OneToOne(mappedBy = "crop", cascade = CascadeType.ALL)
    private Sell sellDetails;

    @OneToMany(mappedBy = "crop", cascade = CascadeType.ALL)
    private List<Status> history;

}
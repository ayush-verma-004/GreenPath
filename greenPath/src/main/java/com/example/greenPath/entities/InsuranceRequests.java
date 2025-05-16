package com.example.greenPath.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "insuranceRequests")
public class InsuranceRequests {

    private Long id;
    private User user;
    private Crop crop;
    private String status;
    private Long claimAmount;

    public InsuranceRequests(){}

    public InsuranceRequests(Long id, User user, Crop crop, String status, Long claimAmount) {
        this.id = id;
        this.user = user;
        this.crop = crop;
        this.status = status;
        this.claimAmount = claimAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getFarmer() {
        return user;
    }

    public void setFarmer(User user) {
        this.user = user;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Long claimAmount) {
        this.claimAmount = claimAmount;
    }
}

package com.example.demo.entities;

public class InsuranceRequests {

    private Long id;
    private Farmer farmer;
    private Crop crop;
    private String status;
    private Long claimAmount;

    public InsuranceRequests(){}

    public InsuranceRequests(Long id, Farmer farmer, Crop crop, String status, Long claimAmount) {
        this.id = id;
        this.farmer = farmer;
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

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
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

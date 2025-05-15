package com.example.demo.entities;

public class InsurancePlans {

    private Long id;
    private Farmer farmer;
    private Crop crop;
    private Long amount;

    public InsurancePlans(){}

    public InsurancePlans(Long id, Farmer farmer, Crop crop, Long amount) {
        this.id = id;
        this.farmer = farmer;
        this.crop = crop;
        this.amount = amount;
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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}

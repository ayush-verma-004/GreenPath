package com.example.greenPath.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "insurancePlans")
public class InsurancePlans {

    private Long id;
    private User user;
    private Crop crop;
    private Long amount;

    public InsurancePlans(){}

    public InsurancePlans(Long id, User user, Crop crop, Long amount) {
        this.id = id;
        this.user = user;
        this.crop = crop;
        this.amount = amount;
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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

}

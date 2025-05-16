package com.example.greenPath.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sell")
public class Sell {

    private Long id;
    private User user;
    private Crop crop;
    private Long sellAmount;
    private Long sellPrice;

    public Sell(){}

    public Sell(Long id, User user, Crop crop, Long sellAmount, Long sellPrice) {
        this.id = id;
        this.user = user;
        this.crop = crop;
        this.sellAmount = sellAmount;
        this.sellPrice = sellPrice;
    }

    public Long getId() { return id; }

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

    public Long getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(Long sellAmount) {
        this.sellAmount = sellAmount;
    }

    public Long getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Long sellPrice) {
        this.sellPrice = sellPrice;
    }

}

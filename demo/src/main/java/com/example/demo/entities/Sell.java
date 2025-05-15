package com.example.demo.entities;


public class Sell {

    private Long id;
    private Farmer farmer;
    private Crop crop;
    private Long sellAmount;
    private Long sellPrice;

    public Sell(){}

    public Sell(Long id, Farmer farmer, Crop crop, Long sellAmount, Long sellPrice) {
        this.id = id;
        this.farmer = farmer;
        this.crop = crop;
        this.sellAmount = sellAmount;
        this.sellPrice = sellPrice;
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

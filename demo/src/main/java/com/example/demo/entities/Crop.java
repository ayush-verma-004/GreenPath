package com.example.demo.entities;

public class Crop {

    private Long id;
    private Farmer farmer;
    private String cropName;
    private String season;
    private Long amount;
    private String landSize;
    private String status;
    private String area;

    public Crop(){}

    public Crop(Long id, Farmer farmer, String cropName, String season, Long amount, String landSize, String status, String area) {
        this.id = id;
        this.farmer = farmer;
        this.cropName = cropName;
        this.season = season;
        this.amount = amount;
        this.landSize = landSize;
        this.status = status;
        this.area = area;
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

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getLandSize() {
        return landSize;
    }

    public void setLandSize(String landSize) {
        this.landSize = landSize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

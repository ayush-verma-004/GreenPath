package com.example.demo.entities;

import java.util.List;

public class Status {

    private Long id;
    private String season;
    private Crop crop;
    private Farmer farmer;
    private String status;
    private List<String> history;

    public Status(){}

    public Status(Long id, String season, Crop crop, Farmer farmer, String status, List<String> history) {
        this.id = id;
        this.season = season;
        this.crop = crop;
        this.farmer = farmer;
        this.status = status;
        this.history = history;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }
}

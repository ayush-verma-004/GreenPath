package com.example.greenPath.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "status")
public class Status {

    private Long id;
    private String season;
    private Crop crop;
    private User user;
    private String status;
    private List<String> history;

    public Status(){}

    public Status(Long id, String season, Crop crop, User user, String status, List<String> history) {
        this.id = id;
        this.season = season;
        this.crop = crop;
        this.user = user;
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

    public User getFarmer() {
        return user;
    }

    public void setFarmer(User user) {
        this.user = user;
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

package com.example.greenPath.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmer")
public class User {

    private Long id;
    private String username;
    private String email;
    private String contact;
    private String password;
    private String location;
    private String landNumber;

    public User(){}

    public User(Long id, String username, String email, String contact, String password, String location, String landNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.location = location;
        this.landNumber = landNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLandNumber() {
        return landNumber;
    }

    public void setLandNumber(String landNumber) {
        this.landNumber = landNumber;
    }
}

package com.gp.GreenPath.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * Entity representing a Farmer in the system.
 */
@Entity
@Table(name = "farmers")
public class Farmer {

    /**
     * Unique identifier for the farmer.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    /**
     * Unique username for authentication.
     */
    @Column(unique = true, nullable = false)
    private String username;

    /**
     * Password for authentication.
     */
    @Column(nullable = false)
    private String password;

    /**
     * Full name of the farmer.
     */
    @Column(nullable = false)
    private String fullName;

    /**
     * Unique email address of the farmer.
     */
    @Column(unique = true, nullable = false)
    private String email;

    /**
     * Phone number of the farmer.
     */
    @Column(nullable = false)
    private String phoneNumber;

    /**
     * Address of the farmer.
     */
    private String address;

    /**
     * Indicates if the email is verified.
     */
    @Column(precision = 10, scale = 2)
    private Boolean isEmailVerified = false;

    /**
     * Status of the farmer (ACTIVE, INACTIVE, SUSPENDED).
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FarmerStatus status = FarmerStatus.ACTIVE;

    /**
     * Date when the farmer was created.
     */
    @Column(nullable = false)
    private LocalDate createdAt;

    /**
     * Date when the farmer was last updated.
     */
    @Column(nullable = false)
    private LocalDate updatedAt;

    /**
     * List of crops owned by the farmer.
     */
    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Crop> crops;

    /**
     * List of crop sales by the farmer.
     */
    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CropSale> cropsSales;

    /**
     * List of crop insurances for the farmer.
     */
    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CropInsurance> cropInsurance;

    /**
     * Default constructor.
     */
    public Farmer() {
    }

    /**
     * Parameterized constructor for Farmer.
     */
    public Farmer(UUID id, String username, String password, String fullName, String email, String phoneNumber, String address, Boolean isEmailVerified, FarmerStatus status, LocalDate createdAt, LocalDate updatedAt, List<Crop> crops, List<CropSale> cropsSales, List<CropInsurance> cropInsurance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isEmailVerified = isEmailVerified;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.crops = crops;
        this.cropsSales = cropsSales;
        this.cropInsurance = cropInsurance;
    }

    // Getters and setters for all fields

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getEmailVerified() {
        return isEmailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        isEmailVerified = emailVerified;
    }

    public FarmerStatus getStatus() {
        return status;
    }

    public void setStatus(FarmerStatus status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }

    public List<CropSale> getCropsSales() {
        return cropsSales;
    }

    public void setCropsSales(List<CropSale> cropsSales) {
        this.cropsSales = cropsSales;
    }

    public List<CropInsurance> getCropInsurance() {
        return cropInsurance;
    }

    public void setCropInsurance(List<CropInsurance> cropInsurance) {
        this.cropInsurance = cropInsurance;
    }

    /**
     * Enum representing the status of a farmer.
     */
    public enum FarmerStatus {
        ACTIVE, INACTIVE, SUSPENDED
    }

    /**
     * Returns a string representation of the Farmer object.
     */
    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", isEmailVerified=" + isEmailVerified +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

}
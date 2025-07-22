package com.gp.GreenPath.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "crop-sales")
public class CropSale {

    // Primary key for CropSale entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    // Quantity of crop sold
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal quantity;

    // Price per unit of crop
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal pricePerUnit;

    // Total sale amount (quantity * pricePerUnit)
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal totalAmount;

    // Date of the sale
    @Column(nullable = false)
    private LocalDate saleDate;

    // Name of the buyer
    @Column(nullable = false)
    private String buyerName;

    // Contact information of the buyer (optional)
    private String buyerContact;

    // Status of the sale (PENDING, CONFIRMED, etc.)
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SaleStatus status = SaleStatus.PENDING;

    // Timestamp when the sale record was created
    @Column(nullable = false)
    private LocalDateTime createdAt;

    // Timestamp when the sale record was last updated
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Reference to the Farmer entity (many sales can belong to one farmer)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farmer_id", nullable = false)
    private Farmer farmer;

    // Reference to the Crop entity (many sales can belong to one crop)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "crop_id", nullable = false)
    private Crop crop;

    // Default constructor
    public CropSale() {
    }

    // All-args constructor
    public CropSale(UUID id, BigDecimal quantity, BigDecimal pricePerUnit, BigDecimal totalAmount, LocalDate saleDate, String buyerName, String buyerContact, SaleStatus status, LocalDateTime createdAt, LocalDateTime updatedAt, Farmer farmer, Crop crop) {
        this.id = id;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.totalAmount = totalAmount;
        this.saleDate = saleDate;
        this.buyerName = buyerName;
        this.buyerContact = buyerContact;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.farmer = farmer;
        this.crop = crop;
    }

    // Getters and setters for all fields

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerContact() {
        return buyerContact;
    }

    public void setBuyerContact(String buyerContact) {
        this.buyerContact = buyerContact;
    }

    public SaleStatus getStatus() {
        return status;
    }

    public void setStatus(SaleStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
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

    // Enum representing possible sale statuses
    public enum SaleStatus {
        PENDING, CONFIRMED, COMPLETED, CANCELLED
    }

}
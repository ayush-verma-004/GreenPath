package com.gp.GreenPath.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * Represents a Crop entity in the GreenPath application.
 */
@Entity
@Table(name = "crops")
public class Crop {

    // Unique identifier for the crop
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    // Name of the crop (e.g., Wheat, Rice)
    @Column(nullable = false)
    private String CropName;

    // Variety of the crop (e.g., Basmati, IR64)
    @Column(nullable = false)
    private String variety;

    // Date when the crop was planted
    @Column(nullable = false)
    private LocalDate plantingDate;

    // Expected date for harvesting the crop
    @Column(nullable = false)
    private LocalDate expectedHarvestDate;

    // Area planted in acres
    @Column(precision = 10, scale = 2)
    private BigDecimal areaPlanted;

    // Expected yield in tons per acre
    @Column(precision = 10, scale = 2)
    private BigDecimal expectedYield;

    // Actual yield in tons per acre
    @Column(precision = 10, scale = 2)
    private BigDecimal actualYield;

    // Current status of the crop (e.g., PLANTED, GROWING, HARVESTED, SOLD)
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CropStatus status;

    // Timestamp when the crop was added
    @Column(nullable = false)
    private LocalDate createdAt;

    // Timestamp of the last update to the crop details
    @Column(nullable = false)
    private LocalDate updatedAt;

    // The farmer who owns this crop
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farmer_id", nullable = false)
    private Farmer farmer;

    // Sales records associated with this crop
    @OneToMany(mappedBy = "crop", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CropSale> CropSales;

    // Insurance records associated with this crop
    @OneToMany(mappedBy = "crop", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CropInsurance> cropInsurances;

    // Default constructor
    public Crop() {
    }

    // All-args constructor
    public Crop(UUID id, String cropName, String variety, LocalDate plantingDate, LocalDate expectedHarvestDate, BigDecimal areaPlanted, BigDecimal expectedYield, BigDecimal actualYield, CropStatus status, LocalDate createdAt, LocalDate updatedAt, Farmer farmer, List<CropSale> cropSales, List<CropInsurance> cropInsurances) {
        this.id = id;
        CropName = cropName;
        this.variety = variety;
        this.plantingDate = plantingDate;
        this.expectedHarvestDate = expectedHarvestDate;
        this.areaPlanted = areaPlanted;
        this.expectedYield = expectedYield;
        this.actualYield = actualYield;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.farmer = farmer;
        CropSales = cropSales;
        this.cropInsurances = cropInsurances;
    }

    // Getters and setters for all fields

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCropName() {
        return CropName;
    }

    public void setCropName(String cropName) {
        CropName = cropName;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public LocalDate getPlantingDate() {
        return plantingDate;
    }

    public void setPlantingDate(LocalDate plantingDate) {
        this.plantingDate = plantingDate;
    }

    public LocalDate getExpectedHarvestDate() {
        return expectedHarvestDate;
    }

    public void setExpectedHarvestDate(LocalDate expectedHarvestDate) {
        this.expectedHarvestDate = expectedHarvestDate;
    }

    public BigDecimal getAreaPlanted() {
        return areaPlanted;
    }

    public void setAreaPlanted(BigDecimal areaPlanted) {
        this.areaPlanted = areaPlanted;
    }

    public BigDecimal getExpectedYield() {
        return expectedYield;
    }

    public void setExpectedYield(BigDecimal expectedYield) {
        this.expectedYield = expectedYield;
    }

    public BigDecimal getActualYield() {
        return actualYield;
    }

    public void setActualYield(BigDecimal actualYield) {
        this.actualYield = actualYield;
    }

    public CropStatus getStatus() {
        return status;
    }

    public void setStatus(CropStatus status) {
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

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public List<CropSale> getCropSales() {
        return CropSales;
    }

    public void setCropSales(List<CropSale> cropSales) {
        CropSales = cropSales;
    }

    public List<CropInsurance> getCropInsurances() {
        return cropInsurances;
    }

    public void setCropInsurances(List<CropInsurance> cropInsurances) {
        this.cropInsurances = cropInsurances;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "id=" + id +
                ", CropName='" + CropName + '\'' +
                ", variety='" + variety + '\'' +
                ", plantingDate=" + plantingDate +
                ", expectedHarvestDate=" + expectedHarvestDate +
                ", areaPlanted=" + areaPlanted +
                ", expectedYield=" + expectedYield +
                ", actualYield=" + actualYield +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", farmer=" + farmer +
                ", CropSales=" + CropSales +
                ", cropInsurances=" + cropInsurances +
                '}';
    }

    /**
     * Enum representing the status of the crop.
     */
    public enum CropStatus {
        PLANTED, GROWING, HARVESTED, SOLD
    }
}
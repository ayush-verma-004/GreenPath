package com.gp.GreenPath.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "crop_insurance")
public class CropInsurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private String policyNumber;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal insuredAmount;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal premiumAmount;

    @Column(nullable = false)
    private LocalDate coverageStartDate;

    @Column(nullable = false)
    private LocalDate coverageEndDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private InsuranceStatus status = InsuranceStatus.PENDING;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = )

    public enum InsuranceStatus{
        PENDING,
        ACTIVE,
        EXPIRED,
        CLAIMED,
        CANCELLED
    }
}

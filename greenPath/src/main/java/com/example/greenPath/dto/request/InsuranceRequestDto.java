package com.example.greenPath.dto.request;

import com.example.greenPath.entities.BankDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceRequestDto {

    private Long cropId;
    private BigDecimal claimAmount;
    private BankDetails payoutBank;

}

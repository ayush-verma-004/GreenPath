package com.example.greenPath.dto.response;

import com.example.greenPath.entities.BankDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceRequestResponse {

    private Long id;
    private Long cropId;
    private BigDecimal claimAmount;
    private String status;
    private BankDetails payoutBank;
    private LocalDate requestedOn;

}

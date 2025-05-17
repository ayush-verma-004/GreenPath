package com.example.greenPath.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsurancePlanResponse {

    private Long id;
    private Long cropId;
    private BigDecimal premium;
    private LocalDate validFrom;
    private LocalDate validUntil;

}



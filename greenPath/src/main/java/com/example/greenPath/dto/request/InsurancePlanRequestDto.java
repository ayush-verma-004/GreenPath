package com.example.greenPath.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsurancePlanRequestDto {

    private Long cropId;
    private BigDecimal premium;
    private LocalDate validFrom;
    private LocalDate validUntil;

}



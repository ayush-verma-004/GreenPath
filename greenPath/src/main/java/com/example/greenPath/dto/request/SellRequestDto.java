package com.example.greenPath.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellRequestDto {

    private Long cropId;
    private BigDecimal quantity;

}



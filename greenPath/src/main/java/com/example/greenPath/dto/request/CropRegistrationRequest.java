package com.example.greenPath.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CropRegistrationRequest {

    private String name;
    private String season;
    private String variety;
    private BigDecimal area;
    private BigDecimal expectedAmount;
    private String primaryImageUrl;
    private String secondaryImageUrl;

}

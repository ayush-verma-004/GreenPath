package com.example.greenPath.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetailsRequestDto {

    private String ifsc;
    private String bankName;
    private String branch;
    private String accountNumber;
    private String cancelledChequeUrl;

}

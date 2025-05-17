package com.example.greenPath.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {

    private String ifsc;
    private String bankName;
    private String branch;
    private String accountNumber;
    private String cancelledChequeUrl;

}
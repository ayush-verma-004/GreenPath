package com.example.greenPath.services.service;


import com.example.greenPath.dto.request.*;
import com.example.greenPath.dto.response.*;
import java.util.List;

public interface FarmerService {

    CropResponse registerCrop(CropRegistrationRequest req);

    InsurancePlanResponse createInsurancePlan(InsurancePlanRequestDto req);

    InsuranceRequestResponse claimInsurance(InsuranceRequestDto req);

    StatusResponse updateStatus(Long cropId, String message);

    List<StatusResponse> getStatusHistory(Long cropId);

    void sellCrop(Long cropId, SellRequestDto req);

    BankDetailsResponse updateBankDetails(BankDetailsRequestDto req);

}
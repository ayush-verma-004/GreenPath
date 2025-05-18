package com.example.greenPath.controllers;


import com.example.greenPath.dto.request.*;
import com.example.greenPath.dto.response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.greenPath.services.service.FarmerService;
import java.util.List;

@RestController
@RequestMapping("/api/farmers")
@RequiredArgsConstructor
public class FarmerController {

    private final FarmerService farmerService;

    // 1. Register a new crop
    @PostMapping("/crops")
    public ResponseEntity<ApiResponse<CropResponse>> registerCrop(@RequestBody CropRegistrationRequest req) {
        CropResponse resp = farmerService.registerCrop(req);
        return ResponseEntity.ok(new ApiResponse<>("Crop registered", resp));
    }

    // 2. Create insurance plan manually
    @PostMapping("/insurance/plans")
    public ResponseEntity<ApiResponse<InsurancePlanResponse>> createPlan(@RequestBody InsurancePlanRequestDto req) {
        InsurancePlanResponse resp = farmerService.createInsurancePlan(req);
        return ResponseEntity.ok(new ApiResponse<>("Insurance plan created", resp));
    }

    // 3. Claim insurance
    @PostMapping("/insurance/claims")
    public ResponseEntity<ApiResponse<InsuranceRequestResponse>> claimInsurance(@RequestBody InsuranceRequestDto req) {
        InsuranceRequestResponse resp = farmerService.claimInsurance(req);
        return ResponseEntity.ok(new ApiResponse<>("Insurance claimed", resp));
    }

    // 4. Update a crop status entry
//    @PostMapping("/crops/{cropId}/status")
//    public ResponseEntity<ApiResponse<StatusResponse>> updateStatus(
//            @PathVariable Long cropId,
//            @RequestBody StatusUpdateRequest req) {
//        StatusResponse resp = farmerService.updateStatus(cropId, req.getMessage());
//        return ResponseEntity.ok(new ApiResponse<>("Status updated", resp));
//    }

    // 5. Get status history for a crop
    @GetMapping("/crops/{cropId}/status")
    public ResponseEntity<ApiResponse<List<StatusResponse>>> getStatus(@PathVariable Long cropId) {
        List<StatusResponse> history = farmerService.getStatusHistory(cropId);
        return ResponseEntity.ok(new ApiResponse<>("Fetched status history", history));
    }

    // 6. Sell crop
    @PostMapping("/crops/{cropId}/sell")
    public ResponseEntity<ApiResponse<String>> sellCrop(
            @PathVariable Long cropId,
            @RequestBody SellRequestDto req) {
        farmerService.sellCrop(cropId, req);
        return ResponseEntity.ok(new ApiResponse<>("Sell order placed", null));
    }

    // 7. Update or view bank details
    @PutMapping("/bank")
    public ResponseEntity<ApiResponse<BankDetailsResponse>> updateBank(@RequestBody BankDetailsRequestDto req) {
        BankDetailsResponse resp = farmerService.updateBankDetails(req);
        return ResponseEntity.ok(new ApiResponse<>("Bank details updated", resp));
    }

}
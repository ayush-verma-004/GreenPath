package com.example.greenPath.services.serviceImpl;


import com.example.greenPath.dto.request.*;
import com.example.greenPath.dto.response.*;
import com.example.greenPath.entities.*;
import com.example.greenPath.repositories.*;
import com.example.greenPath.services.service.FarmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class FarmerServiceImpl implements FarmerService {

    @Autowired
    UserRepository userRepository;
    private final UserRepository userRepo;
    private final CropRepository cropRepo;
    private final InsurancePlanRepository planRepo;
    private final InsuranceRequestRepository claimRepo;
    private final StatusRepository statusRepo;
    private final SellRepository sellRepo;

    @Override
    public CropResponse registerCrop(CropRegistrationRequest req) {
        // lookup authenticated user (omitted)
        User farmer = userRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Farmer not found with ID 1"));
        Crop c = new Crop();
        c.setFarmer(farmer);
        c.setName(req.getName());
        c.setSeason(req.getSeason());
        c.setVariety(req.getVariety());
        c.setArea(req.getArea());
        c.setExpectedAmount(req.getExpectedAmount());
        c.setStatus("REGISTERED");
        c.setPrimaryImageUrl(req.getPrimaryImageUrl());
        c.setSecondaryImageUrl(req.getSecondaryImageUrl());

        cropRepo.save(c);
        return new CropResponse(c.getId(), c.getName(), c.getSeason(), c.getStatus(), c.getArea());
    }

    @Override
    public InsurancePlanResponse createInsurancePlan(InsurancePlanRequestDto req) {
        Crop c = cropRepo.findById(req.getCropId()).orElseThrow();
        User farmer = c.getFarmer();

        InsurancePlan plan = new InsurancePlan();
        plan.setCrop(c);
        plan.setFarmer(farmer);
        plan.setPremium(req.getPremium());
        plan.setValidFrom(req.getValidFrom());
        plan.setValidUntil(req.getValidUntil());
        planRepo.save(plan);

        return new InsurancePlanResponse(plan.getId(), c.getId(), plan.getPremium(), plan.getValidFrom(), plan.getValidUntil());
    }

    @Override
    public InsuranceRequestResponse claimInsurance(InsuranceRequestDto req) {
        Crop c = cropRepo.findById(req.getCropId()).orElseThrow();
        User farmer = c.getFarmer();

        InsuranceRequest claim = new InsuranceRequest();
        claim.setCrop(c);
        claim.setFarmer(farmer);
        claim.setClaimAmount(req.getClaimAmount());
        claim.setStatus("PENDING");
        claim.setRequestedOn(LocalDate.now());
        claimRepo.save(claim);

        return new InsuranceRequestResponse(claim.getId(), c.getId(), claim.getClaimAmount(), claim.getStatus(), null, claim.getRequestedOn());
    }

    @Override
    public StatusResponse updateStatus(Long cropId, String message) {
        Crop c = cropRepo.findById(cropId).orElseThrow();
        Status st = new Status();
        st.setCrop(c);
        st.setMessage(message);
        st.setTimestamp(LocalDate.now());
        statusRepo.save(st);
        return new StatusResponse(st.getId(), st.getMessage(), st.getTimestamp());
    }

    @Override
    public List<StatusResponse> getStatusHistory(Long cropId) {
        return statusRepo.findByCropId(cropId)
                .stream()
                .map(st -> new StatusResponse(st.getId(), st.getMessage(), st.getTimestamp()))
                .collect(Collectors.toList());
    }

    @Override
    public void sellCrop(Long cropId, SellRequestDto req) {
        Crop c = cropRepo.findById(cropId).orElseThrow();
        Sell sell = new Sell();
        sell.setCrop(c);
        sell.setQuantity(req.getQuantity());
        // price decision logic omitted
        sell.setPrice(BigDecimal.ZERO);
        sell.setCreatedOn(LocalDate.now());
        sellRepo.save(sell);
    }

    @Override
    public BankDetailsResponse updateBankDetails(BankDetailsRequestDto req) {
        User farmer = /* fetch current user */ null;
        farmer.getBank().setIfsc(req.getIfsc());
        farmer.getBank().setBankName(req.getBankName());
        farmer.getBank().setBranch(req.getBranch());
        farmer.getBank().setAccountNumber(req.getAccountNumber());
        farmer.getBank().setCancelledChequeUrl(req.getCancelledChequeUrl());
        userRepo.save(farmer);
        BankDetailsResponse resp = new BankDetailsResponse(req.getIfsc(), req.getBankName(), req.getBranch(), req.getAccountNumber(), req.getCancelledChequeUrl());
        return resp;
    }
}

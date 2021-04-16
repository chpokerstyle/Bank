package com.example.demo.service.interfacies;

import com.example.demo.model.DTO.CreditDTO;
import com.example.demo.model.DTO.OfferDTO;

public interface CalculateService {
    CreditDTO statement(OfferDTO offerDTO, CreditDTO creditDTO);
}

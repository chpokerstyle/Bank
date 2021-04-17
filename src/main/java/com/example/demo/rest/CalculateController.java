package com.example.demo.rest;

import com.example.demo.model.DTO.CreditDTO;
import com.example.demo.model.DTO.OfferDTO;
import com.example.demo.service.impl.CalculateServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reg")
public class CalculateController {

    final CalculateServiceImpl service;

    public CalculateController(CalculateServiceImpl service) {
        this.service = service;
    }
    @PostMapping("/credit")
    public CreditDTO createCredit(@RequestBody CreditDTO creditDTO){
        return service.statement(creditDTO);
    }
    @PostMapping("/registration")
    public OfferDTO registrationCredit(@RequestBody OfferDTO offerDTO){
        return service.registration(offerDTO);
    }
}

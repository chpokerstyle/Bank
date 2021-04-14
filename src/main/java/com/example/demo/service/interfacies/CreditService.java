package com.example.demo.service.interfacies;

import com.example.demo.model.DTO.CreditDTO;

import java.util.List;

public interface CreditService {
    CreditDTO create(CreditDTO creditDTO);
    CreditDTO edit(CreditDTO creditDTO);
    void delete(Long id);
    List<CreditDTO>findAll();
}

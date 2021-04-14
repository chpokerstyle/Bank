package com.example.demo.service.interfacies;

import com.example.demo.model.DTO.BankDTO;

import java.util.List;

public interface BankService {
    BankDTO create(BankDTO bankDTO);
    BankDTO edit(BankDTO bankDTO);
    void delete(Long id);
    List<BankDTO>getAll();
}

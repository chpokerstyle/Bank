package com.example.demo.service.impl;

import com.example.demo.model.DTO.CreditDTO;
import com.example.demo.model.converter.interfacies.CreditMap;
import com.example.demo.model.entity.CreditEntity;
import com.example.demo.repo.CreditRepo;
import com.example.demo.service.interfacies.CreditService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CreditServiceImpl implements CreditService {
    final CreditRepo repo;

    public CreditServiceImpl(CreditRepo repo) {
        this.repo = repo;
    }

    @Override
    public CreditDTO create(CreditDTO creditDTO) {
        CreditEntity create = repo.save(CreditMap.INSTANCE.toEntity(creditDTO));
        return CreditMap.INSTANCE.toDto(create);
    }

    @Override
    public CreditDTO edit(CreditDTO creditDTO) {
        CreditEntity edit = repo.save(CreditMap.INSTANCE.toEntity(creditDTO));
        return CreditMap.INSTANCE.toDto(edit);
    }

    @Override
    public void delete(Long id) {
    repo.deleteById(id);
    }

    @Override
    public List<CreditDTO> findAll() {
        return repo.findAll().stream()
                .map(CreditMap.INSTANCE::toDto)
                .collect(Collectors.toList());
    }
}

package com.example.demo.service.impl;

import com.example.demo.model.DTO.BankDTO;
import com.example.demo.model.converter.interfacies.BankMap;
import com.example.demo.model.entity.BankEntity;
import com.example.demo.repo.BankRepo;
import com.example.demo.service.interfacies.BankService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankServiceImpl implements BankService {
    final BankRepo repo;

    public BankServiceImpl(BankRepo repo) {
        this.repo = repo;
    }

    @Override
    public BankDTO create(BankDTO bankDTO) {
        BankEntity save = repo.save(BankMap.INSTANCE.toEntity(bankDTO));
        return BankMap.INSTANCE.toDto(save);
    }

    @Override
    public BankDTO edit(BankDTO bankDTO) {
        BankEntity edit = repo.save(BankMap.INSTANCE.toEntity(bankDTO));
        return BankMap.INSTANCE.toDto(edit);
    }

    @Override
    public void delete(Long id) {
    repo.deleteById(id);
    }

    @Override
    public List<BankDTO> getAll() {
        return repo.findAll().stream()
                            .map(BankMap.INSTANCE::toDto)
                            .collect(Collectors.toList());

    }
}

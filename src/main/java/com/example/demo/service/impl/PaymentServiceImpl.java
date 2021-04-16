package com.example.demo.service.impl;

import com.example.demo.model.DTO.PaymentDTO;
import com.example.demo.model.converter.interfacies.PaymentMap;
import com.example.demo.model.entity.PaymentEntity;
import com.example.demo.repo.PaymentRepo;
import com.example.demo.service.interfacies.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentServiceImpl implements PaymentService {
    final PaymentRepo repo;

    public PaymentServiceImpl(PaymentRepo repo) {
        this.repo = repo;
    }

    @Override
    public PaymentDTO create(PaymentDTO paymentDTO) {
        PaymentEntity create = repo.save(PaymentMap.INSTANCE.toEntity(paymentDTO));
        return PaymentMap.INSTANCE.toDto(create);
    }

    @Override
    public PaymentDTO edit(PaymentDTO paymentDTO) {
        PaymentEntity edit = repo.save(PaymentMap.INSTANCE.toEntity(paymentDTO));
        return PaymentMap.INSTANCE.toDto(edit);
    }

    @Override
    public void delete(Long id) {
    repo.deleteById(id);
    }

    @Override
    public List<PaymentDTO> findAll() {
        return repo.findAll().stream()
                .map(PaymentMap.INSTANCE::toDto)
                .collect(Collectors.toList());
    }
}

package com.example.demo.service.interfacies;

import com.example.demo.model.DTO.OfferDTO;
import com.example.demo.model.DTO.PaymentDTO;

import java.util.List;

public interface PaymentService {
    PaymentDTO create(PaymentDTO paymentDTO);
    PaymentDTO edit(PaymentDTO paymentDTO);
    void delete(Long id);
    List<PaymentDTO> findAll();
}

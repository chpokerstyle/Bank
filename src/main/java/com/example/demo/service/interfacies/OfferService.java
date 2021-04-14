package com.example.demo.service.interfacies;

import com.example.demo.model.DTO.OfferDTO;

import java.util.List;

public interface OfferService {
    OfferDTO create(OfferDTO offerDTO);
    OfferDTO edit(OfferDTO offerDTO);
    void delete(Long id);
    List<OfferDTO>findAll();
}

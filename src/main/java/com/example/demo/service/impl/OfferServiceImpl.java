package com.example.demo.service.impl;

import com.example.demo.model.DTO.OfferDTO;
import com.example.demo.model.converter.interfacies.OfferMap;
import com.example.demo.model.entity.OfferEntity;
import com.example.demo.repo.OfferRepo;
import com.example.demo.service.interfacies.OfferService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfferServiceImpl implements OfferService {
    final OfferRepo repo;

    public OfferServiceImpl(OfferRepo repo) {
        this.repo = repo;
    }

    @Override
    public OfferDTO create(OfferDTO offerDTO) {
        OfferEntity create = repo.save(OfferMap.INSTANCE.toEntity(offerDTO));
        return OfferMap.INSTANCE.toDto(create);
    }

    @Override
    public OfferDTO edit(OfferDTO offerDTO) {
        OfferEntity edit = repo.save(OfferMap.INSTANCE.toEntity(offerDTO));
        return OfferMap.INSTANCE.toDto(edit);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<OfferDTO> findAll() {
        return repo.findAll().stream()
                .map(OfferMap.INSTANCE::toDto)
                .collect(Collectors.toList());
    }
}

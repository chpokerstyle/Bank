package com.example.demo.model.converter.interfacies;

import com.example.demo.model.DTO.OfferDTO;
import com.example.demo.model.entity.OfferEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OfferMap {

    OfferMap INSTANCE = Mappers.getMapper(OfferMap.class);

    OfferDTO toDto(OfferEntity offerEntity);
    OfferEntity toEntity(OfferDTO offerDTO);

}

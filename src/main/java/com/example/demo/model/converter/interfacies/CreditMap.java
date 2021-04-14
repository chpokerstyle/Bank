package com.example.demo.model.converter.interfacies;

import com.example.demo.model.DTO.CreditDTO;
import com.example.demo.model.entity.CreditEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CreditMap {

    CreditMap INSTANCE = Mappers.getMapper(CreditMap.class);

    CreditDTO toDto(CreditEntity creditEntity);
    CreditEntity toEntity(CreditDTO creditDTO);

}

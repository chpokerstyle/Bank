package com.example.demo.model.converter.interfacies;

import com.example.demo.model.DTO.BankDTO;
import com.example.demo.model.entity.BankEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface BankMap {

    BankMap INSTANCE = Mappers.getMapper(BankMap.class);

    BankDTO toDto(BankEntity bankEntity);
    BankEntity toEntity(BankDTO bankDTO);


}

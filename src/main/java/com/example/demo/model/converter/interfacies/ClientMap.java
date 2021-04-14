package com.example.demo.model.converter.interfacies;

import com.example.demo.model.DTO.ClientDTO;
import com.example.demo.model.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMap {

    ClientMap INSTANCE = Mappers.getMapper(ClientMap.class);

    ClientDTO toDto(ClientEntity clientEntity);
    ClientEntity toEntity(ClientDTO clientDTO);

}

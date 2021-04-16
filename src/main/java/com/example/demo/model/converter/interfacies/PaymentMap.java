package com.example.demo.model.converter.interfacies;

import com.example.demo.model.DTO.PaymentDTO;
import com.example.demo.model.entity.PaymentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentMap {
    PaymentMap INSTANCE = Mappers.getMapper(PaymentMap.class);

    PaymentDTO toDto(PaymentEntity paymentEntity);
    PaymentEntity toEntity(PaymentDTO paymentDTO);
}

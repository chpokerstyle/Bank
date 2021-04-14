package com.example.demo;

import com.example.demo.model.DTO.BankDTO;
import com.example.demo.model.converter.interfacies.BankMap;
import com.example.demo.model.entity.BankEntity;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class BankMapTest {
    private BankMap mapper = Mappers.getMapper(BankMap.class);
//
//    @Test
//    public void givenSourceToDestination_whenMaps_thenCorrect() {
//        BankEntity bankEntity = new BankEntity();
//        Long a = Long.valueOf(1);
//        bankEntity.setId(a);
//
//        BankDTO bankDTO = mapper.toDto(bankEntity);
//
//
//    }
}

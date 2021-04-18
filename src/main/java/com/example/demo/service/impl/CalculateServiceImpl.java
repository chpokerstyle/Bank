package com.example.demo.service.impl;

import com.example.demo.model.DTO.CreditDTO;
import com.example.demo.model.DTO.OfferDTO;
import com.example.demo.model.converter.interfacies.*;
import com.example.demo.model.entity.CreditEntity;
import com.example.demo.model.entity.OfferEntity;
import com.example.demo.repo.CreditRepo;
import com.example.demo.repo.OfferRepo;
import com.example.demo.service.interfacies.CalculateService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CalculateServiceImpl implements CalculateService {
    final CreditRepo creditRepo;
    final OfferRepo offerRepo;

    public CalculateServiceImpl(CreditRepo creditRepo, OfferRepo offerRepo) {
        this.creditRepo = creditRepo;
        this.offerRepo = offerRepo;
    }

    @Override
    public CreditDTO statement(CreditDTO creditDTO){
//       // CreditEntity creditDtoFromEntity = CreditMap.INSTANCE.toEntity(creditDTO);
//        CreditEntity creditEntity = new CreditEntity();//кредит
//
//        CreditMap.INSTANCE.toEntity(creditDTO);
//        creditEntity.setLimitSum(creditDTO.getLimitSum());//Сумма необходимая клиенту
//        creditEntity.setPercent(creditDTO.getPercent());//проценты
//        creditEntity.setMonths(creditDTO.getMonths()); // кол-во месяцев
//        creditEntity.getBankEntity().setId(BankMap.INSTANCE.toEntity(creditDTO.getBankDTO()).getId());// id банка
//        creditEntity.getClientEntity().setId(ClientMap.INSTANCE.toEntity( creditDTO.getClientDTO()).getId());// id клиента
CreditEntity creditEntity = CreditMap.INSTANCE.toEntity(creditDTO);


        CreditEntity save = creditRepo.save(creditEntity);

        return CreditMap.INSTANCE.toDto(save);

    }


    @Override
    public OfferDTO registration(OfferDTO offerDTO) {


        OfferEntity offer = new OfferEntity();// новое КП
        CreditEntity creditEntity = CreditMap.INSTANCE.toEntity(statement(offerDTO.getCreditDTO()));

        offer.setCreditId(creditEntity.getId());
        offer.setClientId(creditEntity.getClientEntity().getId());

        int oneРundredPercent = 100;
        offer.setClientId(offer.getClientId());//id клиента вписываем вручную, раз уж спринг секьюрити нет...
        offer.setPaymentDate(new Date());//дата платежа
        offer.setSum(creditEntity.getLimitSum()+creditEntity.getLimitSum()/oneРundredPercent*creditEntity.getPercent());//сумма+проценты
        offer.setSumPay(offer.getSum()/creditEntity.getMonths()); //месячный платёж
        offer.setSumPayDeposit(creditEntity.getLimitSum()/creditEntity.getMonths()); //гашение задолжности без процентов
        offer.setSumPayPercent(offer.getSumPay()-offer.getSumPayDeposit());//гашение процентов

        OfferEntity save = offerRepo.save(offer);
        return OfferMap.INSTANCE.toDto(save);

    }

}

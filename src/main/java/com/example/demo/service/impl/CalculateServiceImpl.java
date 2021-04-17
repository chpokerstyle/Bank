package com.example.demo.service.impl;

import com.example.demo.model.DTO.CreditDTO;
import com.example.demo.model.DTO.OfferDTO;
import com.example.demo.model.converter.interfacies.CreditMap;
import com.example.demo.model.converter.interfacies.OfferMap;
import com.example.demo.model.entity.BankEntity;
import com.example.demo.model.entity.ClientEntity;
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
        CreditEntity creditEntity = new CreditEntity();//кредит
        BankEntity bankEntity = new BankEntity();
        ClientEntity clientEntity = new ClientEntity();
        creditEntity.setLimit(creditDTO.getLimit());//Сумма необходимая клиенту
        creditEntity.setPercent(creditDTO.getPercent());//проценты
        creditEntity.setMonths(creditDTO.getMonths()); // кол-во месяцев
        bankEntity.setId(bankEntity.getId()); // id банка
        clientEntity.setId(clientEntity.getId()); // id клиента

        creditRepo.save(creditEntity);
        creditEntity = new CreditEntity();

        OfferEntity offer = new OfferEntity();// новое КП
        int oneРundredPercent = 100;
        offer.setClientId(offer.getClientId());//id клиента вписываем вручную, раз уж спринг секьюрити нет...
        offer.setPaymentDate(new Date());//дата платежа
        offer.setSum(creditEntity.getLimit()+creditEntity.getLimit()/oneРundredPercent*creditEntity.getPercent());//сумма+проценты
        offer.setSumPay(offer.getSum()/creditEntity.getMonths()); //месячный платёж
        offer.setSumPayDeposit(creditEntity.getLimit()/creditEntity.getMonths()); //гашение задолжности без процентов
        offer.setSumPayPercent(offer.getSumPay()-offer.getSumPayDeposit());//гашение процентов
        registration(OfferMap.INSTANCE.toDto(offer));

        return CreditMap.INSTANCE.toDto(creditRepo.save(creditEntity));
    }


    @Override
    public OfferDTO registration(OfferDTO offerDTO) {

        OfferEntity reg = offerRepo.save(OfferMap.INSTANCE.toEntity(offerDTO));

    return OfferMap.INSTANCE.toDto(reg);
    }

}

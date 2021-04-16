package com.example.demo.service.impl;

import com.example.demo.model.DTO.CreditDTO;
import com.example.demo.model.DTO.OfferDTO;
import com.example.demo.model.converter.interfacies.CreditMap;
import com.example.demo.model.entity.CreditEntity;
import com.example.demo.model.entity.OfferEntity;
import com.example.demo.service.interfacies.CalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    CreditDTO statement(OfferDTO offerDTO, CreditDTO creditDTO){
        CreditEntity creditEntity = new CreditEntity();//кредит
        creditEntity.setLimit(creditDTO.getLimit());//Сумма необходимая клиенту
        creditEntity.setPercent(creditDTO.getPercent());//проценты
        creditEntity.setMonths(creditDTO.getMonths()); // кол-во месяцев

        OfferEntity offer = new OfferEntity();// новое КП
        offer.setClientId(offerDTO.getClientId());//id клиента вписываем вручную, раз уж спринг секьюрити нет...
        offer.setPaymentDate(offerDTO.getPaymentDate());//дата платежа
        offer.setSum(creditEntity.getLimit()*creditEntity.getPercent());//сумма*проценты
        offer.setSumPay(offer.getSum()*creditEntity.getPercent()/creditEntity.getMonths());
        offer.setSumPayDeposit(creditEntity.getLimit()/creditEntity.getMonths());
        offer.setSumPayPercent(offer.getSumPay()-offer.getSumPayDeposit());

    }

    OfferDTO registration(OfferDTO offerDTO, CreditDTO creditDTO) {

    }

}

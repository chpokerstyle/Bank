package com.example.demo.model.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class OfferDTO {
    Long id;
    Long clientId;
    Long creditId;
    int sum;
    Date paymentDate;
    int sumPay;
    int sumPayDeposit;
    int sumPayPercent;

    CreditDTO creditDTO;
    ClientDTO clientDTO;
}

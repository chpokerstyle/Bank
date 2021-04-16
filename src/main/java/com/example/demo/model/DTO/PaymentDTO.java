package com.example.demo.model.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class PaymentDTO {
    Long id;
    Long offerId;
    Date datePay;
    int sumPay;
    int DepositPay;
    int percentPay;
}

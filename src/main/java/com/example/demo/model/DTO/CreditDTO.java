package com.example.demo.model.DTO;

import lombok.Data;

@Data
public class CreditDTO {
    Long id;
    int limitSum;
    int percent;
    int months;

    BankDTO bankDTO;
    ClientDTO clientDTO;
    OfferDTO offerDTO;
}

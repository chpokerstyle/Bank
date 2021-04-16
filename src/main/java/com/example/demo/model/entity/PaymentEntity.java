package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payment")
@Data
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long offerId;
    Date datePay;
    int sumPay;
    int DepositPay;
    int percentPay;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    OfferEntity offerEntity;
}

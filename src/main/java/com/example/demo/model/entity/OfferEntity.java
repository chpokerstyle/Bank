package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "OFFER")
@Data
public class OfferEntity {
    Long id;
    Long clientId;
    Long creditId;
    int sum;
    Date paymentDate;
    int sumPay;
    int sumPayDeposit;
    int sumPayPercent;

    @OneToOne(mappedBy = "offerEntity", optional = false)
    CreditEntity creditEntity;
    @OneToOne(mappedBy = "offerEntity", optional = false)
    ClientEntity clientEntity;
    @OneToMany(mappedBy = "offerEntity", orphanRemoval = false)
    List<PaymentEntity> paymentEntitiesList;
}

package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payment")
//@Data
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    public Date getDatePay() {
        return datePay;
    }

    public void setDatePay(Date datePay) {
        this.datePay = datePay;
    }

    public int getSumPay() {
        return sumPay;
    }

    public void setSumPay(int sumPay) {
        this.sumPay = sumPay;
    }

    public int getDepositPay() {
        return DepositPay;
    }

    public void setDepositPay(int depositPay) {
        DepositPay = depositPay;
    }

    public int getPercentPay() {
        return percentPay;
    }

    public void setPercentPay(int percentPay) {
        this.percentPay = percentPay;
    }

    public OfferEntity getOfferEntity() {
        return offerEntity;
    }

    public void setOfferEntity(OfferEntity offerEntity) {
        this.offerEntity = offerEntity;
    }
}

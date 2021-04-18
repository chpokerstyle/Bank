package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "credit")
//@Data
public class CreditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int limitSum;
    int percent;
    int months;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    ClientEntity clientEntity;
    @OneToOne(mappedBy = "creditEntity", optional = false)
    OfferEntity offerEntity;
    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    BankEntity bankEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLimitSum() {
        return limitSum;
    }

    public void setLimitSum(int limitSum) {
        this.limitSum = limitSum;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public OfferEntity getOfferEntity() {
        return offerEntity;
    }

    public void setOfferEntity(OfferEntity offerEntity) {
        this.offerEntity = offerEntity;
    }

    public BankEntity getBankEntity() {
        return bankEntity;
    }

    public void setBankEntity(BankEntity bankEntity) {
        this.bankEntity = bankEntity;
    }
}
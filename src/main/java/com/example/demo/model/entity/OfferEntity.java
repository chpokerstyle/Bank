package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "OFFER")
//@Data
public class OfferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long clientId;
    Long creditId;
    int sum;
    Date paymentDate;
    int sumPay;
    int sumPayDeposit;
    int sumPayPercent;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    CreditEntity creditEntity;
    @OneToOne(mappedBy = "offerEntity", optional = false)
    ClientEntity clientEntity;
    @OneToMany(mappedBy = "offerEntity", orphanRemoval = false)
    List<PaymentEntity> paymentEntitiesList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getSumPay() {
        return sumPay;
    }

    public void setSumPay(int sumPay) {
        this.sumPay = sumPay;
    }

    public int getSumPayDeposit() {
        return sumPayDeposit;
    }

    public void setSumPayDeposit(int sumPayDeposit) {
        this.sumPayDeposit = sumPayDeposit;
    }

    public int getSumPayPercent() {
        return sumPayPercent;
    }

    public void setSumPayPercent(int sumPayPercent) {
        this.sumPayPercent = sumPayPercent;
    }

    public CreditEntity getCreditEntity() {
        return creditEntity;
    }

    public void setCreditEntity(CreditEntity creditEntity) {
        this.creditEntity = creditEntity;
    }

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public List<PaymentEntity> getPaymentEntitiesList() {
        return paymentEntitiesList;
    }

    public void setPaymentEntitiesList(List<PaymentEntity> paymentEntitiesList) {
        this.paymentEntitiesList = paymentEntitiesList;
    }
}

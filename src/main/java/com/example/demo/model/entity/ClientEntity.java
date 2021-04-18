package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENT")
//@Data
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String lastName;
    String firstName;
    String middleName;
    String number;
    String email;
    int passport;

    @OneToMany(mappedBy = "clientEntity", fetch = FetchType.LAZY)
    List<CreditEntity> creditEntityList;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    OfferEntity offerEntity;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    BankEntity bankEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public List<CreditEntity> getCreditEntityList() {
        return creditEntityList;
    }

    public void setCreditEntityList(List<CreditEntity> creditEntityList) {
        this.creditEntityList = creditEntityList;
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

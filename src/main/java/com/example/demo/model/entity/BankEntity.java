package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BANK")
//@Data
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long clientId;
    Long creditId;

    @OneToMany(mappedBy = "bankEntity", fetch = FetchType.LAZY)
    List<CreditEntity>creditEntityList;
    @OneToMany(mappedBy = "bankEntity", fetch = FetchType.LAZY)
    List<ClientEntity>clientEntityList;

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

    public List<CreditEntity> getCreditEntityList() {
        return creditEntityList;
    }

    public void setCreditEntityList(List<CreditEntity> creditEntityList) {
        this.creditEntityList = creditEntityList;
    }

    public List<ClientEntity> getClientEntityList() {
        return clientEntityList;
    }

    public void setClientEntityList(List<ClientEntity> clientEntityList) {
        this.clientEntityList = clientEntityList;
    }
}

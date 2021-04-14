package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BANK")
@Data
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
}

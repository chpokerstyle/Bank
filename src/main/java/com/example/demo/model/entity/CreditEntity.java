package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "credit")
@Data
public class CreditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int limit;
    int percent;
    int months;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    ClientEntity clientEntity;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    OfferEntity offerEntity;
    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    BankEntity bankEntity;
}

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
    @Column(name = "`limit`")
    int limitSum;
    int percent;
    int months;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    ClientEntity clientEntity;
    @OneToOne(mappedBy = "offerEntity", optional = false)
    OfferEntity offerEntity;
    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    BankEntity bankEntity;
}

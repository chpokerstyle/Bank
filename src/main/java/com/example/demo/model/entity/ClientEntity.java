package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENT")
@Data
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

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    List<CreditEntity> creditEntityList;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    OfferEntity offerEntity;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    BankEntity bankEntity;
}

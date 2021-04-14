package com.example.demo.model.DTO;

import lombok.Data;

@Data
public class ClientDTO {
    Long id;
    String lastName;
    String firstName;
    String middleName;
    String number;
    String email;
    int passport;
}

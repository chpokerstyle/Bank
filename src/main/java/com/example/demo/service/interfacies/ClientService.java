package com.example.demo.service.interfacies;

import com.example.demo.model.DTO.ClientDTO;

import java.util.List;

public interface ClientService {
    ClientDTO create(ClientDTO clientDTO);
    ClientDTO edit(ClientDTO clientDTO);
    void delete(Long id);
    List<ClientDTO>findAll();
}

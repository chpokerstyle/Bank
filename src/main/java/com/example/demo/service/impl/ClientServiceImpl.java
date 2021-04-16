package com.example.demo.service.impl;

import com.example.demo.model.DTO.ClientDTO;
import com.example.demo.model.converter.interfacies.ClientMap;
import com.example.demo.model.entity.ClientEntity;
import com.example.demo.repo.ClientRepo;
import com.example.demo.service.interfacies.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {
    final ClientRepo repo;

    public ClientServiceImpl(ClientRepo repo) {
        this.repo = repo;
    }

    @Override
    public ClientDTO create(ClientDTO clientDTO) {
        ClientEntity create = repo.save(ClientMap.INSTANCE.toEntity(clientDTO));
        return ClientMap.INSTANCE.toDto(create);
    }

    @Override
    public ClientDTO edit(ClientDTO clientDTO) {
        ClientEntity edit = repo.save(ClientMap.INSTANCE.toEntity(clientDTO));
        return ClientMap.INSTANCE.toDto(edit);
    }

    @Override
    public void delete(Long id) {
    repo.deleteById(id);
    }

    @Override
    public List<ClientDTO> findAll() {

       return repo.findAll().stream()
                .map(ClientMap.INSTANCE::toDto)
                .collect(Collectors.toList());

    }
}

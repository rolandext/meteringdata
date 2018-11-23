package com.rolandbalogh.example.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rolandbalogh.example.exception.ResourceNotFoundException;
import com.rolandbalogh.example.model.Client;
import com.rolandbalogh.example.repository.ClientRepository;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @PostMapping("/clients/post")
    public Client createClient(@Valid @RequestBody Client client) {
        return clientRepository.save(client);
    }

    @PutMapping("/clients/{clientId}")
    public Client updateClient(@PathVariable Long clientId, @Valid @RequestBody Client clientRequest) {
        return clientRepository.findById(clientId).map(client -> {
            client.setName(clientRequest.getName());
            return clientRepository.save(client);
        }).orElseThrow(() -> new ResourceNotFoundException("ClientId " + clientId + " not found"));
    }
}
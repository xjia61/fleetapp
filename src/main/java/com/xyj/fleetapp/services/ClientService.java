package com.xyj.fleetapp.services;

import com.xyj.fleetapp.models.Client;
import com.xyj.fleetapp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    //Return list of clients
    private List<Client> getClients(){
        return clientRepository.findAll();
    }
    //save new client

    private  void addClient(Client client){
        clientRepository.save(client);
    }
    //get by id
    private Optional<Client> getClientById(int id){
        return clientRepository.findById(id);
    }

    //delete by id
    private void delete(int id){
        clientRepository.deleteById(id);
    }
}

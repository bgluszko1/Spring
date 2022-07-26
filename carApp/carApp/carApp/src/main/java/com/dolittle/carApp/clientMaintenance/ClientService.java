package com.dolittle.carApp.clientMaintenance;

import com.dolittle.carApp.model.ClientTO;

import java.util.List;


public interface ClientService {

    List<ClientTO> getAllClients();

    void addClient(ClientEntity client);

    void deleteClient(Long id);
}

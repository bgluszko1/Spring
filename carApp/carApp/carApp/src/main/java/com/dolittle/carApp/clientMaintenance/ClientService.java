package com.dolittle.carApp.clientMaintenance;

//import com.dolittle.carApp.carMaintenance.ClientEntity;
import com.dolittle.carApp.carMaintenance.model.ClientTO;

import java.util.List;


public interface ClientService {

    List<ClientTO> getAllClients();

    void addClient(com.dolittle.carApp.ClientMaintenance.ClientEntity client);

    void deleteClient(com.dolittle.carApp.ClientMaintenance.ClientEntity client);

    void deleteClient(Long id);
}

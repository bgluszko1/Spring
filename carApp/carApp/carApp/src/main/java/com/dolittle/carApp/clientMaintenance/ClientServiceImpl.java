package com.dolittle.carApp.clientMaintenance;

import com.dolittle.carApp.model.ClientTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientDAO clientDAO;

    @Override
    public List<ClientTO> getAllClients() {
        return clientDAO.findAll().stream().map(this::mapToClientTO).collect(Collectors.toList());
    }

    @Override
    public void addClient(ClientEntity client) {
        clientDAO.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientDAO.deleteById(id);
    }

    private ClientTO mapToClientTO(ClientEntity clientEntity) {
        return new ClientTO(clientEntity.getId(), clientEntity.getName(), clientEntity.getSurname(),
                clientEntity.getResidency(), clientEntity.getDateOfBirth(), clientEntity.getPhoneNumber(),
                clientEntity.getCreditCardNumber());
    }
}

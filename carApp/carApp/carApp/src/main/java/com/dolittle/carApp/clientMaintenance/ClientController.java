package com.dolittle.carApp.clientMaintenance;

import com.dolittle.carApp.model.ClientTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clientInitialize")
    public void initializeClientDatabase() {
    ClientEntity client = new ClientEntity("Bartosz","Głuszko", "Wrocław",
            LocalDate.of(2000,01,19),"123456789","1232134321432");
        clientService.addClient(client);
    }

    @GetMapping("/clients")
    public List<ClientTO> getAllClients() { return clientService.getAllClients(); }

    @DeleteMapping("/clients/delete/{id}")
    public void deleteClient(@PathVariable("id") Long id) { clientService.deleteClient(id);}
}

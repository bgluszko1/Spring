package com.dolittle.carApp.clientMaintenance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<com.dolittle.carApp.ClientMaintenance.ClientEntity, Long> {

}

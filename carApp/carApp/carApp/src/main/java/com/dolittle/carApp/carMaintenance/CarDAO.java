package com.dolittle.carApp.carMaintenance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Optional;

public interface CarDAO extends JpaRepository<CarEntity, Long> {

}

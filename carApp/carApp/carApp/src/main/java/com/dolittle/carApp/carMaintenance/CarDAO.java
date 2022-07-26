package com.dolittle.carApp.carMaintenance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Optional;

public interface CarDAO extends JpaRepository<CarEntity, Long> {

    @Query("SELECT c FROM CarEntity c WHERE c.model = ?1")
    Collection<CarEntity> findCarEntityByModel(String model);

    @Query("SELECT c FROM CarEntity c WHERE c.id = ?1")
    Collection<CarEntity> findCarById(Long id);
}

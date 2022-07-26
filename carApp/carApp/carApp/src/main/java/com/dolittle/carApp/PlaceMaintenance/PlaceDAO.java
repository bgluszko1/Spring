package com.dolittle.carApp.PlaceMaintenance;

import com.dolittle.carApp.carMaintenance.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceDAO extends JpaRepository<PlaceEntity, Long> {
}

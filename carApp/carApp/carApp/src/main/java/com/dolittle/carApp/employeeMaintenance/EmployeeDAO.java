package com.dolittle.carApp.employeeMaintenance;

import com.dolittle.carApp.employeeMaintenance.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<EmployeeEntity, Long> {
}

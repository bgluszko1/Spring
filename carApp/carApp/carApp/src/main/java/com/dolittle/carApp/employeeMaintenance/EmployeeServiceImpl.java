package com.dolittle.carApp.employeeMaintenance;

import com.dolittle.carApp.model.EmployeeTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeDAO employeeDAO;

    public List<EmployeeTO> getAllEmployees() {
        return employeeDAO.findAll().stream().map(this::mapToEmployeeTO).collect(Collectors.toList());
    }

    private EmployeeTO mapToEmployeeTO(EmployeeEntity employeeEntity) {
        return new EmployeeTO(employeeEntity.getId(), employeeEntity.getPosition(), employeeEntity.getPlaceId());
    }

    private EmployeeEntity mapToEmployeeEntity(EmployeeTO employeeTO) {
        return new EmployeeEntity(employeeTO.getId(), employeeTO.getPosition(), employeeTO.getPlaceId());
    }

}

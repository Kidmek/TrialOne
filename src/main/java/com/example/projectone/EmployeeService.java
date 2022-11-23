package com.example.projectone;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee employee) {
        Optional<Employee> existingEmployee = employeeRepository.findByEmployeeName(employee.getEmployeeName());

        if(existingEmployee.isPresent()){
            throw new RuntimeException("Employee Exists add new Employee");
        }

       return employeeRepository.save(employee);
    }

    public List<Employee> find(){
        List<Employee> employees = employeeRepository.findAll();
        if(employees.isEmpty()){
            throw new RuntimeException("There are no employees registered!");
        }

        return employees;
    }
}

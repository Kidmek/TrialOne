package com.example.projectone;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    Optional<Employee> findByEmployeeName(String name);
}

package com.jcys.springboot.crud.myapp.service;

import com.jcys.springboot.crud.myapp.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

}

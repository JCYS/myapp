package com.jcys.springboot.crud.myapp.dao;

import com.jcys.springboot.crud.myapp.entities.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

}

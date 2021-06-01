package com.dao;

import com.to.Employee;

import java.util.List;

public interface EmployServiceDAO {
    public int addEmployee(Employee e);

    public int deleteEmployee(Employee e);

    public List<Employee> getEmployees();

    public Employee getEmployee(int employeeId);
}

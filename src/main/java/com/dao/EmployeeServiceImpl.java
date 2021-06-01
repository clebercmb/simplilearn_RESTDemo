package com.dao;

import com.to.Employee;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebService
public class EmployeeServiceImpl implements  EmployServiceDAO{

    private static Map<Integer, Employee> employees = new HashMap<>();


    @Override
    public int addEmployee(Employee e) {
        if(e == null || e.getEmpid() == 0) {
            return -1;
        } else {
            employees.put(e.getEmpid(), e);
            return 1;
        }

    }

    @Override
    public int deleteEmployee(Employee e) {
        if(e == null || e.getEmpid() == 0 || employees.size() == 0 || (!employees.containsKey(e.getEmpid()))) {
            return -1;
        }
        employees.remove(e.getEmpid(), e);
        return 1;
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>(employees.values());
        return list;
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return employees.get(employeeId);
    }
}

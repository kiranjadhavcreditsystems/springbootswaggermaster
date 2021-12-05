package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDao;

    public Employee saveData(Employee employee)
    {
        return employeeDao.saveData(employee);
    }

    public boolean loanEligibility(int empId)
    {
       return employeeDao.loanEligibility(empId);
    }
}

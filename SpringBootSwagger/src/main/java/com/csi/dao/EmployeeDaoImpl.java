package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee saveData(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public boolean loanEligibility(int empId)
    {
        boolean flag = false;

        for(Employee employee: employeeRepo.findAll())
        {
            if(employee.getEmpId()==empId && employee.getEmpSalary()>=25000.00)
            {
                flag=true;
            }
        }

        return flag;
    }
}

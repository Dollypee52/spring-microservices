package com.interswitch.services.salary.repository;

import com.interswitch.services.salary.client.DepartmentClient;
import com.interswitch.services.salary.client.EmployeeClient;
import com.interswitch.services.salary.model.Department;
import com.interswitch.services.salary.model.Employee;
import com.interswitch.services.salary.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class SalaryRepository {
    private List<Salary> salaries = new ArrayList<>();
    @Autowired
    EmployeeClient employeeClient;

    @Autowired
    DepartmentClient departmentClient;

    public List<Salary> findAllSalary(){
        return salaries;
    }
    public Salary add(Salary salary){
        salaries.add(salary);
        return salary;
    }
    public Salary findSalaryById(Long id){
        return salaries.stream()
                .filter(salary -> salary.getEmployeeId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public Salary attachEmployeeIdToSalary(Long id, Salary salary){
        Employee employee = employeeClient.findEmployeeById(id);
        Salary mySalary = findSalaryById(salary.getId());
        mySalary.setEmployeeId(employee.getId());
        return mySalary;
    }
    public Salary addDepartmentIdToSalary(Long salaryId, Long departmentId){
        Department department = departmentClient.findDepartmentById(departmentId);
        Salary salary = findSalaryById(salaryId);
        salary.setDepartmentId(department.getId());
        return salary;
    }
}
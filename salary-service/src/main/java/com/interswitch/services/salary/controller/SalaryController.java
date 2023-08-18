package com.interswitch.services.salary.controller;

import com.interswitch.services.salary.model.Salary;
import com.interswitch.services.salary.repository.SalaryRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SalaryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SalaryController.class);
    @Autowired
    SalaryRepository salaryRepository;

    public SalaryController(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    @GetMapping("/salaries")
    public List<Salary> getAllSalaries(){
        LOGGER.info("Employee salary");
        return salaryRepository.findAllSalary();
    }

    @PostMapping()
    public Salary add(@RequestBody Salary salary){
        return salaryRepository.add(salary);
    }

    @GetMapping("/{id}")
    public Salary findById(@PathVariable("id") Long id) {
        LOGGER.info("Salary find: id={}", id);
        return salaryRepository.findSalaryById(id);
    }

    @PostMapping("/attach/{id}")
    public Salary attach(@PathVariable Long id, @RequestBody Salary salary){
        return salaryRepository.attachEmployeeIdToSalary(id, salary);
    }
    @PutMapping("/{salaryId}/{departmentId}")
    public Salary attachDepartment(@PathVariable Long salaryId, @PathVariable Long departmentId){
        return salaryRepository.addDepartmentIdToSalary(salaryId,departmentId);
    }
}
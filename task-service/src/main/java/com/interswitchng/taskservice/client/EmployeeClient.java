package com.interswitchng.taskservice.client;

import com.interswitchng.taskservice.model.Employee;
import com.interswitchng.taskservice.model.Task;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employee-service")
public interface EmployeeClient {

    @GetMapping("/task/{employeeId}")
    List<Employee> findByEmployeeId(@PathVariable("employeeId") Long employeeId);
}


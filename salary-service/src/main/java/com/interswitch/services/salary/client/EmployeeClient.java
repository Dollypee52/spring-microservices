package com.interswitch.services.salary.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.interswitch.services.salary.model.Employee;

@FeignClient(name = "employee-service")
public interface EmployeeClient {
	@GetMapping("/department/{departmentId}")
	List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);

	@GetMapping("/{id}")
	Employee findEmployeeById(@PathVariable("id") Long id);
	
}

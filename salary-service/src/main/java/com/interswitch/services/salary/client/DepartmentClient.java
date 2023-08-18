package com.interswitch.services.salary.client;

import com.interswitch.services.salary.model.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "department-service")
public interface DepartmentClient {
    @GetMapping("/{id}")
    Department findDepartmentById(@PathVariable Long id);
}

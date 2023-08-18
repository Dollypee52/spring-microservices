package com.interswitchng.taskservice.controller;

import com.interswitchng.taskservice.client.EmployeeClient;
import com.interswitchng.taskservice.model.Task;
import com.interswitchng.taskservice.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TaskController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);

    EmployeeClient employeeClient;


    TaskRepository taskrepository;

    public TaskController(EmployeeClient employeeClient, TaskRepository taskrepository) {
        this.employeeClient = employeeClient;
        this.taskrepository = taskrepository;
    }

    @PostMapping("/")
    public Task add(@RequestBody Task task) {
        LOGGER.info("Task add: {}", task);
        return taskrepository.add(task);
    }

    @GetMapping("/tasks/{employeeId}")
    public List<Task> findByEmployeeId(@PathVariable("employeeId") Long employeeId) {
        LOGGER.info("Task assign to: employeeId={}", employeeId);
        return taskrepository.findByEmployeeId(employeeId);
    }

    @GetMapping("/tasks")
    public List<Task> findAll() {
        LOGGER.info("Task find");
        return taskrepository.findAll();
    }


}


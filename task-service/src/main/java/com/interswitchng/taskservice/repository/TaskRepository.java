package com.interswitchng.taskservice.repository;

import com.interswitchng.taskservice.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private List<Task> tasks = new ArrayList<>();

    public Task add(Task task){
        task.setId((long) (tasks.size()+1));
        tasks.add(task);
        return task;
    }


    public List<Task> findAll() {
        return tasks;
    }

    public List<Task> findByEmployeeId(Long employeeId) {
        return tasks.stream()
                .filter(a -> a.getAssignEmployee().equals(employeeId))
                .toList();
    }

}


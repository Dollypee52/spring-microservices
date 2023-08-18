package com.interswitchng.taskservice.model;

public class Task {
    private long id;
    private String name;
    private Long assignEmployee;

    public Task(long id, String name, Long assignEmployee) {
        this.id = id;
        this.name = name;
        this.assignEmployee = assignEmployee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAssignEmployee() {
        return assignEmployee;
    }

    public void setAssignEmployee(Long assignEmployee) {
        this.assignEmployee = assignEmployee;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assignEmployee=" + assignEmployee +
                '}';
    }
}

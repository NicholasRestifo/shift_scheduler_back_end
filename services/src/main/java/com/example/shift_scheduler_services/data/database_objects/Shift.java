package com.example.shift_scheduler_services.data.database_objects;

import java.time.LocalDateTime;
import java.util.List;

public class Shift {
    int id;

    JobLocation jobLocation;

    Position position;

    LocalDateTime startTime;

    LocalDateTime endTime;

    int maxEmployees;

    List<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JobLocation getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(JobLocation jobLocation) {
        this.jobLocation = jobLocation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getMaxEmployees() {
        return maxEmployees;
    }

    public void setMaxEmployees(int maxEmployees) {
        this.maxEmployees = maxEmployees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

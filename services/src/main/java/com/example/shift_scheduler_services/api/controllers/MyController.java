package com.example.shift_scheduler_services.api.controllers;

import com.example.shift_scheduler_services.data.database_objects.Employee;
import com.example.shift_scheduler_services.data.database_objects.JobLocation;
import com.example.shift_scheduler_services.data.database_objects.Position;
import com.example.shift_scheduler_services.data.database_objects.Shift;
import com.example.shift_scheduler_services.data.repositories.EmployeeRepository;
import com.example.shift_scheduler_services.data.repositories.JobLocationRepository;
import com.example.shift_scheduler_services.data.repositories.PositionRepository;
import com.example.shift_scheduler_services.data.repositories.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    JobLocationRepository jobLocationRepository;

    @Autowired
    PositionRepository positionRepository;

    @Autowired
    ShiftRepository shiftRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = new LinkedList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    @GetMapping(value = "/job_locations")
    public List<JobLocation> getJobLocations() {
        List<JobLocation> jobLocations = new LinkedList<>();
        jobLocationRepository.findAll().forEach(jobLocations::add);
        return jobLocations;
    }

    @GetMapping(value = "/positions")
    public List<Position> getPositions() {
        List<Position> positions = new LinkedList<>();
        positionRepository.findAll().forEach(positions::add);
        return positions;
    }

    @GetMapping(value = "/shifts")
    public List<Shift> getShifts() {
        List<Shift> shifts = new LinkedList<>();
        shiftRepository.findAll().forEach(shifts::add);
        return shifts;
    }
}

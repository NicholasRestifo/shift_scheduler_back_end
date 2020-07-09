package com.example.shift_scheduler_services.data.database_objects;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;

public class Employee {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;
    
    JobLocation jobLocation;

    Position position;

    List<Shift> shifts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }
}

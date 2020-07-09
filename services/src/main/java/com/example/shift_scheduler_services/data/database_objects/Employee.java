package com.example.shift_scheduler_services.data.database_objects;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    @ManyToOne
    @JoinColumn(name = "job_location_id")
    JobLocation jobLocation;

    @ManyToOne
    @JoinColumn(name = "position_id")
    Position position;

//    List<Shift> shifts;

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

//    public List<Shift> getShifts() {
//        return shifts;
//    }
//
//    public void setShifts(List<Shift> shifts) {
//        this.shifts = shifts;
//    }
}

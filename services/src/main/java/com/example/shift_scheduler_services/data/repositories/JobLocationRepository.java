package com.example.shift_scheduler_services.data.repositories;

import com.example.shift_scheduler_services.data.database_objects.JobLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobLocationRepository extends CrudRepository<JobLocation, Integer> {
}

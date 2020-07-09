package com.example.shift_scheduler_services.data.repositories;

import com.example.shift_scheduler_services.data.database_objects.Shift;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRepository extends CrudRepository<Shift, Integer> {
}

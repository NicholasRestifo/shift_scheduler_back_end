package com.example.shift_scheduler_services.data.repositories;

import com.example.shift_scheduler_services.data.database_objects.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends CrudRepository<Position, Integer> {
}

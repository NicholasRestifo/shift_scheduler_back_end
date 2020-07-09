package com.example.shift_scheduler_services.api.controllers;

import com.example.shift_scheduler_services.data.database_objects.Position;
import com.example.shift_scheduler_services.data.repositories.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    PositionRepository positionRepository;

    @GetMapping(value = "/test1")
    public List<Position> getPositions() {
        List<Position> positions = new LinkedList<>();
        positionRepository.findAll().forEach(positions::add);
        return positions;
    }
}

package com.example.controller;

import com.example.entity.Direction;
import com.example.service.DirectionService;
import com.example.dto.ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://127.0.0.1:8000")
public class DirectionController {
    @Autowired
    DirectionService service;

    @GetMapping("/")
    public List<Direction> getall() {
        return service.getall();
    }

    @PostMapping("/process")
    public ServiceData processDirection(@RequestBody ServiceData serviceData) {
        return service.processData(serviceData);
    }
}

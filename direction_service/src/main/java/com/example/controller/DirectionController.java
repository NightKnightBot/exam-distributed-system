package com.example.controller;

import com.example.entity.Direction;
import com.example.service.DirectionService;
import com.example.dto.ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
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

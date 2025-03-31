package com.example.controller;

import com.example.service.DirectionService;
import com.example.dto.ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DirectionController {
    @Autowired
    DirectionService service;

    @PostMapping("/process")
    public ServiceData processDirection(@RequestBody ServiceData serviceData) {
        return service.processData(serviceData);
    }
}

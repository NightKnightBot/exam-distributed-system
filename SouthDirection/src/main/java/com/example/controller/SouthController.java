package com.example.controller;

import com.example.dto.ServiceData;
import com.example.service.SouthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SouthController {
    @Autowired
    SouthService service;

    @PostMapping("/")
    ServiceData get(@RequestBody ServiceData serviceData) {
        return serviceData;
    }

    @PostMapping("/process")
    public ServiceData processDirection(@RequestBody ServiceData serviceData) {
        return service.processData(serviceData);
    }
}

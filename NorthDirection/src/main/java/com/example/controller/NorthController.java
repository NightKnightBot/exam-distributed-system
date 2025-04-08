package com.example.controller;

import com.example.dto.ServiceData;
import com.example.service.NorthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NorthController {
    @Autowired
    NorthService service;

    @PostMapping("/")
    ServiceData get(@RequestBody ServiceData serviceData) {
        return serviceData;
    }

    @PostMapping("/process")
    public ServiceData processDirection(@RequestBody ServiceData serviceData) {
        return service.processData(serviceData);
    }
}
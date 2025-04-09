package com.example.controller;

import com.example.dto.ServiceData;
import com.example.entity.West;
import com.example.service.WestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WestController {
    @Autowired
    WestService service;

    @GetMapping("/")
    public List<West> gett() {
        return service.gett();
    }
    @PostMapping("/test")
    ServiceData get(@RequestBody ServiceData serviceData) {
        return serviceData;
    }
    @PostMapping("/")
    public ServiceData processDirection(@RequestBody ServiceData serviceData) {
        return service.processData(serviceData);
    }
}


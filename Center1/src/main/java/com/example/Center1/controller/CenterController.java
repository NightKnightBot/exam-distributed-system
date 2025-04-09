package com.example.Center1.controller;

import com.example.Center1.dto.ServiceData;
import com.example.Center1.entity.Center;
import com.example.Center1.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CenterController {
    @Autowired
    CenterService service;

    @GetMapping("/")
    public List<Center> gett() {
        return service.gett();
    }
    @PostMapping("/test")
    ServiceData get(@RequestBody ServiceData serviceData) {
        return serviceData;
    }
    @PostMapping("/")
    public ServiceData processDirection(@RequestBody ServiceData serviceData) {
        System.out.println("Ello");
        return service.processData(serviceData);
    }
}
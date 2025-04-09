package com.example.controller;

import com.example.dto.ServiceData;
import com.example.entity.MHEntity;
import com.example.service.MHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MHController {
    @Autowired
    MHService mhService;

    @GetMapping("/")
    public List<MHEntity> get() {
        return mhService.get();
    }

    @PostMapping("/")
    public ServiceData test(@RequestBody ServiceData serviceData) {
        serviceData.setRollNumber("123");
        return serviceData;
    }

    @PostMapping("/process")
    public ServiceData processDirection(@RequestBody ServiceData serviceData) {
        return mhService.processData(serviceData);
    }
}


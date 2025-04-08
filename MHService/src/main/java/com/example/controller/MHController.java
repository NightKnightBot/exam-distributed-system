package com.example.controller;

import com.example.dto.ServiceData;
import com.example.service.MHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MHController {
    @Autowired
    MHService mhService;

    @PostMapping("/process")
    public ServiceData processDirection(@RequestBody ServiceData serviceData) {
        return mhService.processData(serviceData);
    }
}


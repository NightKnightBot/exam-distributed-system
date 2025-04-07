package com.example.controller;

import com.example.dto.ServiceData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NorthController {
    @PostMapping("/")
    ServiceData get(@RequestBody ServiceData serviceData) {
        return serviceData;
    }
}
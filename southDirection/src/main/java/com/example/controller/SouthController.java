package com.example.controller;

import com.example.dto.ServiceData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SouthController {
    @PostMapping("/")
    ServiceData get(@RequestBody ServiceData serviceData) {
        return serviceData;
    }
}

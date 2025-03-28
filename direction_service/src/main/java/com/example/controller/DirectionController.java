package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Direction;

@RestController
public class DirectionController {
    Direction direction = null;
    @GetMapping("/")
    public Direction hello() {
        if(direction == null)
            return null;
        else
            return direction;
    }

    @PostMapping("/")
    public void createDirection(@RequestBody Direction direction) {
        this.direction = direction;
    }
}

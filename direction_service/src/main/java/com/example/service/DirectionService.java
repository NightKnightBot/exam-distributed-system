package com.example.service;

import com.example.client.GenericServiceClient;
import com.example.dto.ServiceData;
import com.example.entity.Direction;
import com.example.repository.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionService {
    @Autowired
    DirectionRepository directionRepository;
    @Autowired
    FeignClientBuilder feignClientBuilder;

    public List<Direction> getall() {
        return  directionRepository.findAll();
    }

    public ServiceData processData(ServiceData data) {
        Direction direction = directionRepository.findByDirection(data.getDirection());
        if (direction == null) {
            throw new RuntimeException("Direction not found " + data.getDirection());
        }
        GenericServiceClient client = feignClientBuilder.forType(GenericServiceClient.class, direction.getTargetUrl()).build();
        return client.get(data);
    }
}

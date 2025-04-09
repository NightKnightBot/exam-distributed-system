package com.example.service;

import com.example.client.GenericServiceClient;
import com.example.dto.ServiceData;
import com.example.entity.East;
import com.example.repository.EastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

@Service
public class EastService {
    @Autowired
    EastRepository eastRepository;
    @Autowired
    FeignClientBuilder feignClientBuilder;

    public ServiceData processData(ServiceData data) {
        East east = eastRepository.findByDirection(data.getState());
        if (east == null) {
            throw new RuntimeException("Direction not found " + data.getDirection());
        }
        GenericServiceClient client = feignClientBuilder.forType(GenericServiceClient.class, east.getTargetUrl()).build();
        return client.get(data);
    }
}

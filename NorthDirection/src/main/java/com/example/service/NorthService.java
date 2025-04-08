package com.example.service;

import com.example.client.GenericServiceClient;
import com.example.dto.ServiceData;
import com.example.entity.NorthEntity;
import com.example.repository.NorthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

@Service
public class NorthService {
    @Autowired
    NorthRepository northRepository;

    @Autowired
    FeignClientBuilder feignClientBuilder;

    public ServiceData processData(ServiceData data) {
        NorthEntity northEntity = northRepository.findByDirection(data.getDirection());
        if (northEntity == null) {
            throw new RuntimeException("Direction not found " + data.getDirection());
        }

        GenericServiceClient client = feignClientBuilder.forType(GenericServiceClient.class, northEntity.getTargetUrl()).build();

        return client.get(data);
    }

}

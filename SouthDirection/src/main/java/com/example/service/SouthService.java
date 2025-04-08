package com.example.service;

import com.example.client.GenericServiceClient;
import com.example.dto.ServiceData;
import com.example.entity.SouthEntity;
import com.example.repository.SouthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

@Service
public class SouthService {
    @Autowired
    SouthRepository southRepository;

    @Autowired
    FeignClientBuilder feignClientBuilder;

    public ServiceData processData(ServiceData data) {
        SouthEntity southEntity = southRepository.findByDirection(data.getDirection());
        if (southEntity == null) {
            throw new RuntimeException("Direction not found " + data.getDirection());
        }

        GenericServiceClient client = feignClientBuilder.forType(GenericServiceClient.class, southEntity.getTargetUrl()).build();

        return client.get(data);
    }

}

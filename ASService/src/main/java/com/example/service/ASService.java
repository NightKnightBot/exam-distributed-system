package com.example.service;

import com.example.client.GenericServiceClient;
import com.example.dto.ServiceData;
import com.example.entity.ASEntity;
import com.example.repository.ASRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

@Service
public class ASService {
    @Autowired
    ASRepository asRepository;
    @Autowired
    FeignClientBuilder feignClientBuilder;

    public ServiceData processData(ServiceData data) {
        ASEntity asEntity = asRepository.findByDirection(data.getDirection());
        if (asEntity == null) {
            throw new RuntimeException("Direction not found " + data.getDirection());
        }
        GenericServiceClient client = feignClientBuilder.forType(GenericServiceClient.class, asEntity.getTargetUrl()).build();
        return client.get(data);
    }
}

package com.example.service;

import com.example.client.GenericServiceClient;
import com.example.dto.ServiceData;
import com.example.entity.MHEntity;
import com.example.repository.MHRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

@Service
public class MHService {
    @Autowired
    MHRepository mhRepository;

    @Autowired
    FeignClientBuilder feignClientBuilder;

    public ServiceData processData(ServiceData data) {
        MHEntity asEntity = mhRepository.findByDirection(data.getDirection());
        if (asEntity == null) {
            throw new RuntimeException("Direction not found " + data.getDirection());
        }
        GenericServiceClient client = feignClientBuilder.forType(GenericServiceClient.class, asEntity.getTargetUrl()).build();
        return client.get(data);
    }
}

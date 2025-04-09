package com.example.service;

import com.example.client.GenericServiceClient;
import com.example.dto.ServiceData;
import com.example.entity.West;
import com.example.repository.WestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WestService {
    @Autowired
    WestRepository westRepository;
    @Autowired
    FeignClientBuilder feignClientBuilder;

    public List<West> gett() {
        return westRepository.findAll();
    }

    public ServiceData processData(ServiceData data) {
        West west = westRepository.findByDirection(data.getState());
        if (west == null) {
            throw new RuntimeException("Direction not found " + data.getDirection());
        }
        GenericServiceClient client = feignClientBuilder.forType(GenericServiceClient.class, west.getTargetUrl()).build();
        return client.get(data);
    }
}

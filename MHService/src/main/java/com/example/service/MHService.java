package com.example.service;

import com.example.client.GenericServiceClient;
import com.example.dto.ServiceData;
import com.example.entity.MHEntity;
import com.example.repository.MHRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MHService {
    @Autowired
    MHRepository mhRepository;

    @Autowired
    FeignClientBuilder feignClientBuilder;

    public List<MHEntity> get() {
        return mhRepository.findAll();
    }

    public ServiceData processData(ServiceData data) {
        MHEntity asEntity = mhRepository.findByUid(data.getCenter());
        if (asEntity == null) {
            throw new RuntimeException("Center not found " + data.getCenter());
        }
        GenericServiceClient client = feignClientBuilder.forType(GenericServiceClient.class, asEntity.getTargetUrl()).build();
        return client.get(data);
    }
}

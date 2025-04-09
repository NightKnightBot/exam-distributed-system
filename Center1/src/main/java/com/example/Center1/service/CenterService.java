package com.example.Center1.service;

import com.example.Center1.repository.CenterRepository;
import com.example.Center1.dto.ServiceData;
import com.example.Center1.entity.Center;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenterService {
    @Autowired
    CenterRepository centerRepository;
    @Autowired
    FeignClientBuilder feignClientBuilder;

    public List<Center> gett() {
        return centerRepository.findAll();
    }

    public ServiceData processData(ServiceData data) {
        Center center = centerRepository.findByRollno(data.getRollNumber());
        if (center == null) {
            throw new RuntimeException("Student not found " + data.getRollNumber());
        }
        data.setMarks(center.getMarks());
        System.out.println(data.getMarks());
        return data;
    }
}

package com.example.Center1.client;

import com.example.Center1.dto.ServiceData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "${dynamic.service}", url = "http://${dynamic.service}")
public interface GenericServiceClient {
    @PostMapping("/")
    ServiceData get(@RequestBody ServiceData serviceData);
}
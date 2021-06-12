package com.pxp.kubernetesentryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppService {

    @Autowired
    private RestTemplate restTemplate;

    public String getBackEndResponse(){
        String backendResponse = restTemplate.getForObject("http://localhost:8000/greet", String.class);

        return "Response from entry app " + backendResponse;
    }
}

package com.example.postapi.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostSerivce {

    RestTemplate restTemplate = new RestTemplate();

    public String service(String zipcode) {
        String url = "https://zip-cloud.appspot.com/api/search?"+zipcode;
        String json = restTemplate.getForObject(url, String.class, zipcode);
        return json;
    }
}

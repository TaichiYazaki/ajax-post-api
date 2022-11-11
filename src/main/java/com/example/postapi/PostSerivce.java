package com.example.postapi;


import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.postapi.DTO.Results;
import com.example.postapi.DTO.ZipCodeDTO;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PostSerivce {

    RestTemplate restTemplate = new RestTemplate();

    public List<Results> service(String zipCode) throws IOException {
        String url = "http://zipcloud.ibsnet.co.jp/api/search?zipcode=" + zipCode;
        String json = restTemplate.getForObject(url, String.class, zipCode);
        ObjectMapper mapper = new ObjectMapper();
        ZipCodeDTO dto = mapper.readValue(json, ZipCodeDTO.class);
        List<Results> results = dto.getResults();
        return results;
        // System.out.println(results.get(0).getAddress1());
    }
}

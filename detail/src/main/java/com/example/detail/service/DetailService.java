package com.example.detail.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface DetailService {
    List<Integer> findCityIdByName(String city);

}



package com.example.detail.pojo;

import lombok.Data;

@Data
public class City {
    private Integer woeid;

    public Integer getWoeid(){
        return woeid;
    }
}

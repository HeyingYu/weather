package com.example.search.pojo;

import lombok.Data;


@Data
public class City {
    private Integer woeid;

    public Integer getWoeid(){
        return woeid;
    }
}

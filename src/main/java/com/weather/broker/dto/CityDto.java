package com.weather.broker.dto;

import lombok.Data;

@Data
public class CityDto {

    private int id;

    private String name;

    private String currentWeather;

}

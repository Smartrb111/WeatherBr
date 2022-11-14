package com.weather.broker.controller.city;

import com.weather.broker.dto.CityDto;
import com.weather.broker.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping
    public CityDto getCityById(@RequestParam Long cityId) throws Exception {
        return cityService.getCity(cityId);
    }
}

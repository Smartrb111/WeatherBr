package com.weather.broker.controller.city;

import com.weather.broker.dto.CityDto;
import com.weather.broker.entity.CityEntity;
import com.weather.broker.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/citiy")
@AllArgsConstructor
public class CityController {

    private final CityService cityService;

    private final CityDto cityDto;


    @GetMapping
    public CityDto getCityById(@RequestParam Long cityId) throws Exception {
        return cityService.getById(cityId);
    }

    @PostMapping("/cities")
    public ResponseEntity<CityEntity> createCity(@RequestBody CityDto сityDto) {

        return ResponseEntity.ok(cityService.create(cityDto));
    }
}

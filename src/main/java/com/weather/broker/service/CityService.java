package com.weather.broker.service;

import com.weather.broker.dto.CityDto;
import com.weather.broker.mapper.city.CityMapper;
import com.weather.broker.repos.CityRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class CityService {
    private final CityRepo cityRepo;
    private final CityMapper cityMapper;

    @Transactional
    public CityDto getCity(Long id) throws Exception {
        return cityMapper.toDto(cityRepo.findById(id).orElseThrow(Exception::new));
    }
}

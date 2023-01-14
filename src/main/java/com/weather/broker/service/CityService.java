package com.weather.broker.service;

import com.weather.broker.dto.CityDto;
import com.weather.broker.entity.CityEntity;
import com.weather.broker.mapper.city.CityMapper;
import com.weather.broker.repos.CityRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class CityService {

    private final CityMapper cityMapper;

    private final CityRepo cityRepo;


    @Transactional
    public CityDto getById(Long id) throws Exception {
        return cityMapper.toDto(cityRepo.findById(id).orElseThrow(Exception::new));
    }

   /* public List<CityDto> getAll() {
    }*/

    public CityEntity create(CityDto dto) {
        return cityRepo.save(cityMapper.fromDto(dto));
    }

}

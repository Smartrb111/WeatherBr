package com.weather.broker.mapper.city;

import com.weather.broker.dto.CityDto;
import com.weather.broker.entity.CityEntity;
import com.weather.broker.mapper.common.EntityWithIdMapper;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "jsr330", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CityMapper extends EntityWithIdMapper<CityDto, CityEntity> {
}

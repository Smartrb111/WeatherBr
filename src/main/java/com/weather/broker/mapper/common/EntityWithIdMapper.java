package com.weather.broker.mapper.common;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

public interface EntityWithIdMapper<DTO, ENTITY> {
    ENTITY fromDto(DTO dto);

    DTO toDto(ENTITY entity);

    List<DTO> toDto(Iterable<ENTITY> var1);

    /*@Mapping(target = "id", ignore = true)
    void merge(@MappingTarget ENTITY var1, DTO var2);*/
}


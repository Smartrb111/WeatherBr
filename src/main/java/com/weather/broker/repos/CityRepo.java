package com.weather.broker.repos;

import com.weather.broker.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<CityEntity, Long> {
}

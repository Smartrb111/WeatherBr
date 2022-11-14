package com.weather.broker.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Getter
@Setter
@Entity
@Table(name = "city")
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Please enter your name")
    @Length(max = 200, message = "The name is too long (more the 2kb)")
    @Column(name = "name")
    private String name;

    @Column(name = "current_weather")
    private String currentWeather;
}

package com.guilherme.webfluxreactivefeignstarwars.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PeopleResponse {

    private String name;
    private String birth_year;
    private String gender;
    private String height;
    private String skin_color;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
}

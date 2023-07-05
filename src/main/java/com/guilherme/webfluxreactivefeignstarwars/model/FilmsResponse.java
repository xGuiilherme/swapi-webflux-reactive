package com.guilherme.webfluxreactivefeignstarwars.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FilmsResponse {

    private String title;
    private String episode_id;
    private String opening_crawl;
    private String director;
    private List<String> characters;
}

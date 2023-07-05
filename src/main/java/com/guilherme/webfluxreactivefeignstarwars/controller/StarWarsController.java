package com.guilherme.webfluxreactivefeignstarwars.controller;

import com.guilherme.webfluxreactivefeignstarwars.client.FeignClient;
import com.guilherme.webfluxreactivefeignstarwars.model.FilmsResponse;
import com.guilherme.webfluxreactivefeignstarwars.model.PeopleResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/reactive-feign")
public class StarWarsController {

    private FeignClient feignClient;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/person/{id}")
    public Mono<PeopleResponse> findPeopleById(@PathVariable String id) {
        return feignClient.getPeopleById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/movie/{id}")
    public Mono<FilmsResponse> findFilmsById(@PathVariable String id) {
        return feignClient.getFilmsById(id);
    }
}

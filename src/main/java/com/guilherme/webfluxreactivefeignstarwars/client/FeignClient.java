package com.guilherme.webfluxreactivefeignstarwars.client;

import com.guilherme.webfluxreactivefeignstarwars.model.FilmsResponse;
import com.guilherme.webfluxreactivefeignstarwars.model.PeopleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(url = "https://swapi.dev/api/", name = "star-wars")
public interface FeignClient {

    // Mono: Trata de um unico dado ex: 1 filme ou 1 carro e Flux: Traz de 0-N varias informações no mesmo objeto ex: Listar 10 filmes.
    @GetMapping("/people/{id}")
    Mono<PeopleResponse> getPeopleById(@RequestParam(value = "id") String id);

    @GetMapping("/films/{id}")
    Mono<FilmsResponse> getFilmsById(@RequestParam(value = "id") String id);
}

package ru.ruslan.springapp.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.ruslan.springapp.Object.Film;
import ru.ruslan.springapp.SpringappApplication;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@RestController
public class FilmController {

    @GetMapping("/search-by-keyword")
    @ResponseBody
    public ResponseEntity getFilms(@RequestParam Optional<String> keyword){
        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/search-by-keyword?keyword=белый клык";

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-API-KEY", "9edb045d-6a23-4ab7-8f9b-6321f366ea31");
        headers.set("accept", "application/json");

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<Film> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Film.class);

        return response;
    }

    @GetMapping("/search-by-id")
    @ResponseBody
    public ResponseEntity getFilmsid(@RequestParam String id){
        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/{id}";
        System.out.println(fooResourceUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-API-KEY", "9edb045d-6a23-4ab7-8f9b-6321f366ea31");
        headers.set("accept", "application/json");
        headers.set("id", id);
        log.info(id);

        Map<String, String> params = new HashMap<String, String>();
        params.put("id", id);


        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<Film> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Film.class, params);

        return response;
    }

    @GetMapping("/hello")
    ResponseEntity<Film> hello() {

        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/600";

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-API-KEY", "9edb045d-6a23-4ab7-8f9b-6321f366ea31");
        headers.set("accept", "application/json");

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<Film> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Film.class);

        return response;
    }

    private RestTemplate restTemplate;

    private static final Logger log = LoggerFactory.getLogger(SpringappApplication.class);

    @Autowired
    public FilmController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public String run(RestTemplate restTemplate) throws Exception {


        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/600";

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-API-KEY", "9edb045d-6a23-4ab7-8f9b-6321f366ea31");
        headers.set("accept", "application/json");

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<Film> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Film.class);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("film.json"), response.getBody());
        return response.toString();
    }
}

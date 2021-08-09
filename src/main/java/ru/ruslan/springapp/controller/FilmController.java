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
import ru.ruslan.springapp.Object.Film_id;
import ru.ruslan.springapp.Object.Search_Films;
import ru.ruslan.springapp.SpringappApplication;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@RestController
public class FilmController {

    private RestTemplate restTemplate;
    private static final Logger log = LoggerFactory.getLogger(SpringappApplication.class);
    public FilmController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @GetMapping("/search-by-keyword")
    public ResponseEntity getFilms(String keyword){
        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/search-by-keyword?keyword={keyword}";

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-API-KEY", "9edb045d-6a23-4ab7-8f9b-6321f366ea31");
        headers.set("accept", "application/json");

        Map<String, String> params = new HashMap<String, String>();
        params.put("keyword", keyword);

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<Search_Films> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Search_Films.class,params);

        return response;
    }

    @GetMapping("/search-by-id")
    public ResponseEntity getFilmsid(@RequestParam String id){
        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/{id}";
        System.out.println(fooResourceUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-API-KEY", "9edb045d-6a23-4ab7-8f9b-6321f366ea31");
        headers.set("accept", "application/json");
        //headers.set("id", id);
        log.info(id);

        Map<String, String> params = new HashMap<String, String>();
        params.put("id", id);


        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<Film_id> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Film_id.class, params);

        return response;
    }

    @GetMapping("/hello")
    public ResponseEntity<Film_id> hello() throws Exception {

        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/500";

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-API-KEY", "9edb045d-6a23-4ab7-8f9b-6321f366ea31");
        headers.set("accept", "application/json");

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<Film_id> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Film_id.class);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("film.json"), response.getBody());

        return response;
    }



/*
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

        ResponseEntity<Film_id> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Film_id.class);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("film.json"), response.getBody());
        return response.toString();
    }

 */
}

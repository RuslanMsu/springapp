package ru.ruslan.springapp.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.ruslan.springapp.FilmRepository.FilmsRepository;
import ru.ruslan.springapp.dto.Film;
import ru.ruslan.springapp.dto.Film_id;
import ru.ruslan.springapp.dto.Search_Films;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


@RestController
@AllArgsConstructor
@Log4j2
public class FilmController {

    private RestTemplate restTemplate;
    private HttpEntity<String> entity;
    private FilmsRepository filmsRepository;

    @GetMapping("/search-by-keyword")
    public ResponseEntity<Search_Films> getFilms(String keyword){
        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/search-by-keyword?keyword={keyword}";

        Map<String, String> params = new HashMap<>();
        params.put("keyword", keyword);

        ResponseEntity<Search_Films> responce = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Search_Films.class, params);
        for(Film i : responce.getBody().getFilms()){
            filmsRepository.save(i);
        }

        return responce;
    }

    @GetMapping("/search-by-id")
    public ResponseEntity<Film_id> getFilmsid(@RequestParam String id){
        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/{id}";
        log.info(fooResourceUrl);
        log.info(id);

        Map<String, String> params = new HashMap<>();
        params.put("id", id);

        return  restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Film_id.class, params);

    }

    @GetMapping("/hello")
    public ResponseEntity<Film_id> hello() {

        String fooResourceUrl
                = "https://kinopoiskapiunofficial.tech/api/v2.1/films/500";


        ResponseEntity<Film_id> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Film_id.class);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("film.json"), response.getBody());
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }

}

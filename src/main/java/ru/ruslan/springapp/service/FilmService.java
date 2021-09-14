package ru.ruslan.springapp.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ru.ruslan.springapp.dao.FilmDao;
import ru.ruslan.springapp.dto.Film;
import ru.ruslan.springapp.dto.Search_Films;
import org.modelmapper.ModelMapper;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class FilmService {

    HttpEntity<String> entity;
    RestTemplate restTemplate;
    FilmDao filmDao;

    @Value("${kinopoiskApi}")
    String fooResourceUrl;

    public ResponseEntity<Search_Films> getFilms(String keyword) {
        Map<String, String> params = new HashMap<>();
        params.put("keyword", keyword);

        ResponseEntity<Search_Films> response = restTemplate.exchange(
                fooResourceUrl, HttpMethod.GET, entity, Search_Films.class, params);
        for(Film i : response.getBody().getFilms()){
            ModelMapper mapper = new ModelMapper();
            ru.ruslan.springapp.model.Film film = mapper.map(i, ru.ruslan.springapp.model.Film.class);
            filmDao.save(film);
        }
        return response;
    }
}

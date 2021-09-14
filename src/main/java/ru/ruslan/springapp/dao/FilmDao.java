package ru.ruslan.springapp.dao;

import lombok.AllArgsConstructor;
import ru.ruslan.springapp.model.Film;
import ru.ruslan.springapp.repository.FilmsRepository;

import javax.transaction.Transactional;

@AllArgsConstructor
public class FilmDao {
    FilmsRepository filmsRepository;

    @Transactional
    public void save(Film film) {
        filmsRepository.save(film);
    }
}

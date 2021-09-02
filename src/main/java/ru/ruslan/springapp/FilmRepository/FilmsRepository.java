package ru.ruslan.springapp.FilmRepository;

import org.springframework.data.repository.CrudRepository;
import ru.ruslan.springapp.dto.Film;


public interface FilmsRepository extends CrudRepository<Film, Integer> {

}

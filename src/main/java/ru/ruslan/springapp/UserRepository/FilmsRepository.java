package ru.ruslan.springapp.UserRepository;

import org.springframework.data.repository.CrudRepository;
import ru.ruslan.springapp.dto.Film;
import ru.ruslan.springapp.dto.Search_Films;


public interface FilmsRepository extends CrudRepository<Film, Integer> {

}

package ru.ruslan.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ruslan.springapp.model.Film;


public interface FilmsRepository extends CrudRepository<Film, Integer> {


}

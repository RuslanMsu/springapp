package ru.ruslan.springapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter

public class Search_Films {
    private String keyword;
    private Integer searchFilmsCountResult; //Число фильмов на всех страницах
    private List<Film> films;               //В списке только число пильмов с первой страницы

    //public Integer pagesCount;
}

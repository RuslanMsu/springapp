package ru.ruslan.springapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter

public class Search_Films {
    public String keyword;
    public Integer pagesCount;
    public Integer searchFilmsCountResult;
    public List<Film> films;
}

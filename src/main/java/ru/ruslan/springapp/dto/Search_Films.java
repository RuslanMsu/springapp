package ru.ruslan.springapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Search_Films {
    public String keyword;
    public Integer pagesCount;
    public Integer searchFilmsCountResult;
    public List<Film> films;

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setPagesCount(Integer pagesCount) {
        this.pagesCount = pagesCount;
    }

    public void setSearchFilmsCountResult(Integer searchFilmsCountResult) {
        this.searchFilmsCountResult = searchFilmsCountResult;
    }

    public int getSearchFilmsCountResult() {
        return searchFilmsCountResult;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public List<Film> getFilms() {
        return films;
    }

    public String getKeyword() {
        return keyword;
    }
}

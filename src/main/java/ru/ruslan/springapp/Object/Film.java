package ru.ruslan.springapp.Object;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Film {
    public Integer filmId;
    public String nameRu;
    public String nameEn;
    public String type;
    public String year;
    public String description;
    public String filmLength;
    public List<Country> countries;
    public List<Genre> genres;
    public String rating;
    public Integer ratingVoteCount;
    public String posterUrl;
    public String posterUrlPreview;

    public void setYear(String year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPosterUrlPreview(String posterUrlPreview) {
        this.posterUrlPreview = posterUrlPreview;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setRatingVoteCount(Integer ratingVoteCount) {
        this.ratingVoteCount = ratingVoteCount;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getType() {
        return type;
    }

    public String getPosterUrlPreview() {
        return posterUrlPreview;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public String getNameRu() {
        return nameRu;
    }

    public String getFilmLength() {
        return filmLength;
    }

    public String getDescription() {
        return description;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public Integer getRatingVoteCount() {
        return ratingVoteCount;
    }

    public String getRating() {
        return rating;
    }

    public String getYear() {
        return year;
    }
}

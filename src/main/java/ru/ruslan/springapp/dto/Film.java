package ru.ruslan.springapp.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter

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
}

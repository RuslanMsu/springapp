package ru.ruslan.springapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter

public class Data {
    private Integer filmId;
    private String nameRu;
    private String nameEn;
    private String webUrl;
    private String posterUrl;
    private String posterUrlPreview;
    private Integer year;
    private String filmLength;
    private String slogan;
    private String description;
    private String type;
    private String ratingMpaa;
    private Integer ratingAgeLimits;
    private String premiereRu;
    private String distributors;
    private String premiereWorld;
    private String  premiereDigital;
    private String premiereWorldCountry;
    private String premiereDvd;
    private String premiereBluRay;
    private String distributorRelease;
    private List<Country> countries;
    private List<Genre> genres;
    private List<String> facts;
    //private List<Object> seasons;
}

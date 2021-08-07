package ru.ruslan.springapp.Object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
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


    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public void setDistributorRelease(String distributorRelease) {
        this.distributorRelease = distributorRelease;
    }

    public void setDistributors(String distributors) {
        this.distributors = distributors;
    }

    public void setFacts(List<String> facts) {
        this.facts = facts;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public void setPosterUrlPreview(String posterUrlPreview) {
        this.posterUrlPreview = posterUrlPreview;
    }

    public void setPremiereBluRay(String premiereBluRay) {
        this.premiereBluRay = premiereBluRay;
    }

    public void setPremiereDigital(String premiereDigital) {
        this.premiereDigital = premiereDigital;
    }

    public void setPremiereDvd(String premiereDvd) {
        this.premiereDvd = premiereDvd;
    }

    public void setPremiereRu(String premiereRu) {
        this.premiereRu = premiereRu;
    }

    public void setPremiereWorld(String premiereWorld) {
        this.premiereWorld = premiereWorld;
    }

    public void setPremiereWorldCountry(String premiereWorldCountry) {
        this.premiereWorldCountry = premiereWorldCountry;
    }

    public void setRatingAgeLimits(Integer ratingAgeLimits) {
        this.ratingAgeLimits = ratingAgeLimits;
    }

    public void setRatingMpaa(String ratingMpaa) {
        this.ratingMpaa = ratingMpaa;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public Integer getRatingAgeLimits() {
        return ratingAgeLimits;
    }

    public Integer getYear() {
        return year;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public List<String> getFacts() {
        return facts;
    }

    public String getDescription() {
        return description;
    }

    public String getDistributorRelease() {
        return distributorRelease;
    }

    public String getDistributors() {
        return distributors;
    }

    public String getFilmLength() {
        return filmLength;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getNameRu() {
        return nameRu;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public String getPosterUrlPreview() {
        return posterUrlPreview;
    }

    public String getPremiereBluRay() {
        return premiereBluRay;
    }

    public String getPremiereDigital() {
        return premiereDigital;
    }

    public String getPremiereDvd() {
        return premiereDvd;
    }

    public String getPremiereRu() {
        return premiereRu;
    }

    public String getPremiereWorld() {
        return premiereWorld;
    }

    public String getPremiereWorldCountry() {
        return premiereWorldCountry;
    }

    public String getRatingMpaa() {
        return ratingMpaa;
    }

    public String getSlogan() {
        return slogan;
    }

    public String getType() {
        return type;
    }

    public String getWebUrl() {
        return webUrl;
    }


}

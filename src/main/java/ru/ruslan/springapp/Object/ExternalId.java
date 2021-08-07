package ru.ruslan.springapp.Object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalId {
    private String imdbId;

    public ExternalId(){}

    public void setImdbId(String imdbId){
        this.imdbId = imdbId;

    }
    public String getImdbId() {
        return imdbId;
    }
}

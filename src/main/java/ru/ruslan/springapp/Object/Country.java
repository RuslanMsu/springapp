package ru.ruslan.springapp.Object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

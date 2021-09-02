package ru.ruslan.springapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@Embeddable

public class Genre {
    private String genre;
}

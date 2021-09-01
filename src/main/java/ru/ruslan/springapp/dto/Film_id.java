package ru.ruslan.springapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@Entity
public class Film_id {

    private Data data;
    private ExternalId externalId;

    public  Film_id(){}
}

package ru.ruslan.springapp.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter

@Entity
public class Film {
    @Id
    @Column(name="Film_Id")
    private Integer filmId;
    private String nameEn;
    private String year;
    @ElementCollection
    private List<Genre> genres;
    private String rating;



    //public String type;
    //public String description;
    //public String filmLength;
    //private List<Country> countries;
    //public String nameRu;
    //public Integer ratingVoteCount;
    //public String posterUrl;
    //public String posterUrlPreview;
}

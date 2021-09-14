package ru.ruslan.springapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

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
    @OneToMany()
    private List<Genre> genres;
    private String rating;

}

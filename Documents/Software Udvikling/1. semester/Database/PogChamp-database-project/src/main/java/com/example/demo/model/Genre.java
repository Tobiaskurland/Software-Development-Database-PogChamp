package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "genre", schema = "PogChamp", catalog = "")
public class Genre {
    private int id;
    private String genreTitle;
    private Integer ageLimit;

    public Genre() {
    }

    public Genre(int id, String genreTitle, Integer ageLimit) {
        this.id = id;
        this.genreTitle = genreTitle;
        this.ageLimit = ageLimit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Genre_title")
    public String getGenreTitle() {
        return genreTitle;
    }

    public void setGenreTitle(String genreTitle) {
        this.genreTitle = genreTitle;
    }

    @Basic
    @Column(name = "Age_limit")
    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre that = (Genre) o;
        return id == that.id &&
                Objects.equals(genreTitle, that.genreTitle) &&
                Objects.equals(ageLimit, that.ageLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, genreTitle, ageLimit);
    }
}

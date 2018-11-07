package com.ssm.entry;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Director {
    private int id;
    private String directorName;
    private int directorAge;
    private List<Movie> movieList;
    private Date birth;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getDirectorAge() {
        return directorAge;
    }

    public void setDirectorAge(int directorAge) {
        this.directorAge = directorAge;
    }
}

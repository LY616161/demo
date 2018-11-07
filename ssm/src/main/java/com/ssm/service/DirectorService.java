package com.ssm.service;

import com.ssm.entry.Director;

import java.util.List;

public interface DirectorService {
    public List<Director> listDirector();

    public Director selectDirectorById(int id);

    public void insertDirector(Director director);

    public void deleteDirector(int id);

    public void updateDirector(Director director);

    public List<Director> listDirectorAndMovie();

    public Director selectDirectorAndMovie(int id);

    public void insertDirectorDate(Director director);

    public List<Director> listDate();
}

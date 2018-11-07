package com.ssm.service.impl;

import com.ssm.dao.DirectorDao;
import com.ssm.entry.Director;
import com.ssm.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService{
    @Autowired
    private DirectorDao directorDao;

    @Override
    public List<Director> listDirector() {
        return directorDao.listDirector();
    }

    @Override
    public Director selectDirectorById(int id) {
        return directorDao.selectDirectorById(id);
    }

    @Override
    public void insertDirector(Director director) {
         directorDao.insertDirector(director);
    }

    @Override
    public void deleteDirector(int id) {
        directorDao.deleteDirector(id);

    }

    @Override
    public void updateDirector(Director director) {
        directorDao.updateDirector(director);
    }

    @Override
    public List<Director> listDirectorAndMovie() {
        return directorDao.listDirectorAndMovie();
    }

    @Override
    public Director selectDirectorAndMovie(int id) {
        return directorDao.selectDirectorAndMovie(id);
    }

    @Override
    public void insertDirectorDate(Director director) {
        directorDao.insertDirectorDate(director);
    }

    @Override
    public List<Director> listDate() {
        return directorDao.listDate();
    }

}

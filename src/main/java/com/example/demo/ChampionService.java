package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionService {

    @Autowired
    private ChampionDao championDao;

    public List<Champion> getChampions() {
       return this.championDao.findAll();
    }
}

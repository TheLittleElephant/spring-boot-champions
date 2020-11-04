package com.example.demo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChampionController {

    @Autowired
    private ChampionService championService;

    @GetMapping("/")
    private List<Champion> champions() {
      return this.championService.getChampions();
    }
}

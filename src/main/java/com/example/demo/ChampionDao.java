package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionDao extends JpaRepository<Champion, Integer> {
}

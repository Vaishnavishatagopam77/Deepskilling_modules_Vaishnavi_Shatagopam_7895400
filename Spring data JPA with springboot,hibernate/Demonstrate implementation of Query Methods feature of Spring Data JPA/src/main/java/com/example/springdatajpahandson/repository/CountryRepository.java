package com.example.springdatajpahandson.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpahandson.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByCode(String code);

    List<Country> findByName(String name);

    List<Country> findByNameContaining(String name);

}
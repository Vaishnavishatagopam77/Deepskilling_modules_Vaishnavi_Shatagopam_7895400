package com.example.springdatajpahandson.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springdatajpahandson.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    // Hibernate Query Language (HQL)
    @Query("FROM Country")
    List<Country> getAllCountriesHQL();

    // Native SQL Query
    @Query(value = "SELECT * FROM country", nativeQuery = true)
    List<Country> getAllCountriesNative();
}
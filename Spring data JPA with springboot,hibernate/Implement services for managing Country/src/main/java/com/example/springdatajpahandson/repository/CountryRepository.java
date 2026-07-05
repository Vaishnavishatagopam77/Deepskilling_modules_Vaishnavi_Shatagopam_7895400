package com.example.springdatajpahandson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springdatajpahandson.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}
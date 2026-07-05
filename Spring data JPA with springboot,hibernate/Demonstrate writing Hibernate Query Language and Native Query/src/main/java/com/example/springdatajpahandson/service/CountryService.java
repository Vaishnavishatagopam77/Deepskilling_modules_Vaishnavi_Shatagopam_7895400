package com.example.springdatajpahandson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpahandson.model.Country;
import com.example.springdatajpahandson.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountriesHQL() {
        return countryRepository.getAllCountriesHQL();
    }

    public List<Country> getAllCountriesNative() {
        return countryRepository.getAllCountriesNative();
    }
}
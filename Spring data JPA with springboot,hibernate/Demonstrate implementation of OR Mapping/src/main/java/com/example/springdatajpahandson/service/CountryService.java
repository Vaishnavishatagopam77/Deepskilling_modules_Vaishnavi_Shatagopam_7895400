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

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryByCode(String code) {
        return countryRepository.findByCode(code);
    }

    public List<Country> getCountryByName(String name) {
        return countryRepository.findByName(name);
    }

    public List<Country> searchCountry(String name) {
        return countryRepository.findByNameContaining(name);
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }
}
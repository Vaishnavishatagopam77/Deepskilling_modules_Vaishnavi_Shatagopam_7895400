package com.example.springdatajpahandson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springdatajpahandson.model.Country;
import com.example.springdatajpahandson.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/code/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryService.getCountryByCode(code);
    }

    @GetMapping("/name/{name}")
    public List<Country> getCountryByName(@PathVariable String name) {
        return countryService.getCountryByName(name);
    }

    @GetMapping("/search/{name}")
    public List<Country> searchCountry(@PathVariable String name) {
        return countryService.searchCountry(name);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }
}
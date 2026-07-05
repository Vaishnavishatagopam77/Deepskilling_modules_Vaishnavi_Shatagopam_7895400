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

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountryByCode(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }
}
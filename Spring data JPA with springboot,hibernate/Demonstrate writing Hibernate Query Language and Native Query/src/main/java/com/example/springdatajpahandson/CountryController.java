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

    // HQL Query
    @GetMapping("/hql")
    public List<Country> getCountriesHQL() {
        return countryService.getAllCountriesHQL();
    }

    // Native Query
    @GetMapping("/native")
    public List<Country> getCountriesNative() {
        return countryService.getAllCountriesNative();
    }
}
package com.example.springresthandson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springresthandson.model.Country;

@RestController
public class CountryController {

    List<Country> countryList = new ArrayList<>();

    public CountryController() {

        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
        countryList.add(new Country("JP", "Japan"));
        countryList.add(new Country("AU", "Australia"));
    }

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}
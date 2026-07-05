package com.example.springresthandson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springresthandson.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {

        Country country = new Country();
        country.setCode("IN");
        country.setName("India");

        return country;
    }
}
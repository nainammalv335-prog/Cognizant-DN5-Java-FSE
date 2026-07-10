package com.example.countryservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public String getCountries() {
        return "India, USA, Japan";
    }
}

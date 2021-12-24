package com.github.carlosolvjunior.citiesapi.countries.repository;


import com.github.carlosolvjunior.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}



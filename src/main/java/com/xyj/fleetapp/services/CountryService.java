package com.xyj.fleetapp.services;

import com.xyj.fleetapp.models.Country;
import com.xyj.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    //Return list of countries;
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    //save new country
    public void saveCountry(Country country){
        countryRepository.save(country);
    }
    //get by id
    public Optional<Country> getCountryById(Integer id){
        return countryRepository.findById(id);
    }
    //delete by id

    public void deleteCountry(Integer id){

        countryRepository.deleteById(id);
    }

}

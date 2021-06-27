package com.xyj.fleetapp.controllers;

import com.xyj.fleetapp.models.Country;
import com.xyj.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;

    //get all countries
    @GetMapping("/countries")
    public String getCountries(Model model){
        List<Country> countryList=countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "country";
    }

    //save country
    @PostMapping("/countries/addNew")
    public String addNew(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";

    }
    //find country by id
    @RequestMapping("/countries/findById")
    @ResponseBody
    public Optional<Country> findById(Integer id){
        return countryService.getCountryById(id);
    }
    //update country
    @RequestMapping(value = "/countries/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";
    }
    //delete country by id

    @RequestMapping(value = "/countries/delete", method = {RequestMethod.DELETE,RequestMethod.GET})

    public String delete(Integer id){
        countryService.deleteCountry(id);
        return "redirect:/countries";
    }



}

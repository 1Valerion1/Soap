package com.example.soapclient.controller;

import com.example.soapclient.client.SoapClientImpl;
import com.example.soapclient.dto.GetCountryResponse;
import com.example.soapclient.dto.GetMovieResponse;
import com.example.soapclient.dto.ItemResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final SoapClientImpl soapClient;

    @GetMapping("items/{id}")
    public ItemResponse item(@PathVariable final int id){
        return soapClient.getItemInfo(id);
    }


    @GetMapping(value = "countries/{name}")
    public ModelAndView countries(@PathVariable final String name){

        GetCountryResponse response = soapClient.getCountry(name);

        ModelAndView modelAndView = new ModelAndView("country");
        modelAndView.addObject("country", response.getCountry());

        return modelAndView;
    }


    @GetMapping(value = "movies/{genre}")
    public ModelAndView movies(@PathVariable final String genre){

        GetMovieResponse response = soapClient.getMovie(genre);

        ModelAndView modelAndView = new ModelAndView("movie");
        modelAndView.addObject("movie", response.getMovie());

        return modelAndView;
    }
}

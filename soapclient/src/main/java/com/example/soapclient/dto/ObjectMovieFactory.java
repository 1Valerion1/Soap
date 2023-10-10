package com.example.soapclient.dto;

import com.example.soapclient.models.Movie;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectMovieFactory {


    public ObjectMovieFactory() {
    }

    /**
     * Create an instance of {@link GetCountryRequest }
     *
     * @return
     *     the new instance of {@link GetCountryRequest }
     */
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }

    /**
     * Create an instance of {@link GetMovieResponse }
     *
     * @return
     *     the new instance of {@link GetMovieResponse }
     */
    public GetMovieResponse creategetMovieResponse () {
        return new GetMovieResponse();
    }

    /**
     * Create an instance of {@link Movie }
     *
     * @return
     *     the new instance of {@link Movie }
     */
    public Movie createMovie() {
        return new Movie();
    }

}

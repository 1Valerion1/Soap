package com.example.soapservice.dto;

import com.example.soapservice.models.Movie;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "movie"
})
@XmlRootElement(name = "getMovieResponse")
public class GetMovieResponse {
    @XmlElement(required = true)
    protected Movie movie;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}

package com.example.soapclient.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie", propOrder = {
        "title",
        "genre",
        "author",
        "duration",
        "rating"
})
public class Movie {

    @XmlElement(required = true)
    private String title;
    @XmlElement(required = true)
    private String genre;
    @XmlElement(required = true)
    private  String author;

    @XmlElement(required = true)
    private  double duration;

    @XmlElement(required = true)
    private  double rating;


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

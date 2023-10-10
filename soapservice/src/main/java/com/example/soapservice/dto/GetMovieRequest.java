package com.example.soapservice.dto;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "genre"
})
@XmlRootElement(name = "getMovieRequest")
public class GetMovieRequest {
    @XmlElement(required = true)
    protected String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

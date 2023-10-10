package com.example.soapservice.repository;

import com.example.soapservice.models.Movie;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class MovieRepository {
    private static final Map<String, Movie> movies = new HashMap<>();

    @PostConstruct
    public void initData() {
        Movie movie1 = new Movie();
        movie1.setTitle("The Shawshank Redemption");
        movie1.setGenre("Drama");
        movie1.setRating(9.3);
        movie1.setAuthor("Director: Frank Darabont");
        movie1.setDuration(2.37);

        movies.put(movie1.getGenre(), movie1);

        Movie movie2 = new Movie();
        movie2.setTitle("The Green Mile");
        movie2.setGenre("Fantasy");
        movie2.setRating(8.6);
        movie2.setAuthor("Director: Frank Darabont");
        movie2.setDuration(3.15);
        movies.put(movie2.getGenre(), movie2);

        Movie movie3 = new Movie();
        movie3.setTitle("Pulp Fiction");
        movie3.setGenre("Crime");
        movie3.setRating(8.9);
        movie3.setAuthor("Director: Quentin Tarantino");
        movie3.setDuration(2.54);
        movies.put(movie3.getGenre(), movie3);

        Movie movie4 = new Movie();
        movie4.setTitle("Inception");
        movie4.setGenre("Adventure");
        movie4.setRating(8.8);
        movie4.setAuthor("Director: Christopher Nolan");
        movie4.setDuration(2.48);
        movies.put(movie4.getGenre(), movie4);

        Movie movie5 = new Movie();
        movie5.setTitle("Fight Club");
        movie5.setGenre("Thriller");
        movie5.setRating(8.8);
        movie5.setAuthor("Director: David Fincher");
        movie5.setDuration(2.31);
        movies.put(movie5.getGenre(), movie5);

    }

    public Movie findMovie(String name) {
        Assert.notNull(name, "The movie's title must not be null");
        return movies.get(name);
    }
}

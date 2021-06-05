package com.Golden.MoviesDB.controller;

import java.util.Collections;
import java.util.List;

import com.Golden.MoviesDB.models.Movie;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
  // create a movie
  @PostMapping(value = "/movies")
  public void createMovie(@RequestBody Movie movie) {
    System.out.println("Creating entry");
    System.out.println(movie.toString());
  }
  
  // list movies
  @GetMapping(value = "/movies")
  public List<Movie> getMovies() {
    Movie movie = new Movie();
    movie.setFormat("dvd");
    movie.setLength(134);
    movie.setRating(5);
    movie.setReleaseYear(2018);
    movie.setTitle("Black Panther");
    List<Movie> moviesList = Collections.singletonList(movie);
    return moviesList;
  }

  @GetMapping(value = "/movies/{id}")
  public Movie getMovie(@PathVariable String id) {
    Movie movie = new Movie();
    movie.setFormat("dvd");
    movie.setLength(134);
    movie.setRating(5);
    movie.setReleaseYear(2018);
    movie.setTitle("Black Panther");
    movie.setId(id);
    return movie;
  }

  // update a movie
  @PutMapping(value = "/movies/{id}")
  public void updateMovie(@PathVariable String id, @RequestBody Movie movie) {
    System.out.println("Updating Entry " + id);
    System.out.println(movie.toString());
  }
  
  // delete a movie
  @DeleteMapping(value = "/movies/{id}")
  public void deleteMovie(@PathVariable String id) {
    System.out.println("Deleting entry " + id);
  }

}

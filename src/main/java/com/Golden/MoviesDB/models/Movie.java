package com.Golden.MoviesDB.models;

import lombok.Data;

@Data
public class Movie {
  private String id;

  private String title;
  private String format;
  private int length;
  private int releaseYear;
  private int rating;
}
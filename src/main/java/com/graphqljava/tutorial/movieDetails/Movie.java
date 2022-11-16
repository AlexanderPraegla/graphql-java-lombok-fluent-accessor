package com.graphqljava.tutorial.movieDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
@SuperBuilder
public abstract class Movie {
    private String title;

}

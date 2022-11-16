package com.graphqljava.tutorial.movieDetails;


import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Data
@Accessors(fluent = true)
@SuperBuilder
public class ActionMovie extends Movie {
    private int nrOfExplosions;

    public ActionMovie(final String title, int nrOfExplosions) {
        super(title);
        this.nrOfExplosions = nrOfExplosions;
    }
}

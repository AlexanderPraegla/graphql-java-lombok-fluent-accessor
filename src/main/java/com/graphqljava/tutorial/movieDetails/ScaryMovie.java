package com.graphqljava.tutorial.movieDetails;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Data
@Accessors(fluent = true)
@SuperBuilder
public class ScaryMovie extends Movie {
    private boolean gory;
    private int scareFactor;

    public ScaryMovie(final String title, final boolean gory, final int scareFactor) {
        super(title);
        this.gory = gory;
        this.scareFactor = scareFactor;
    }

}

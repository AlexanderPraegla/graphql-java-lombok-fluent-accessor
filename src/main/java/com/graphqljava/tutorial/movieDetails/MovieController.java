package com.graphqljava.tutorial.movieDetails;

import com.graphqljava.tutorial.movieDetails.ActionMovie;
import com.graphqljava.tutorial.movieDetails.Movie;
import com.graphqljava.tutorial.movieDetails.ScaryMovie;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MovieController {


    @QueryMapping
    public List<Movie> movies() {
        return List.of(
            new ActionMovie("Crouching Tiger", 0),
            new ActionMovie("Black hawk down", 10),
            new ScaryMovie("American Horror Story", true, 10),
            new ScaryMovie("Love Death + Robots", false, 4)
        );
    }
}
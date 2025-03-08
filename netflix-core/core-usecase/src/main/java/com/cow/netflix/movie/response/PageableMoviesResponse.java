package com.cow.netflix.movie.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PageableMoviesResponse {

    private final List<MovieResponse> tmdbMovies;
    private final int page;
    private final boolean hasNext;
}

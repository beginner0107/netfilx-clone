package com.cow.netflix.movie;

public interface TmdbMoviePort {
    TmdbPageableMovies fetchPageable(int page);
}

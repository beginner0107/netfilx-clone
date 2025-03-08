package com.cow.netflix.movie;

import com.cow.netflix.movie.response.PageableMoviesResponse;

public interface FetchMovieUseCase {
    PageableMoviesResponse fetchFromClient(int page);
}

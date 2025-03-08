package com.cow.netflix.tmdb;

import com.cow.netflix.client.TmdbHttpClient;
import com.cow.netflix.movie.TmdbMoviePort;
import com.cow.netflix.movie.TmdbPageableMovies;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class TmdbMovieListHttpClient implements TmdbMoviePort {

    @Value("${tmdb.api.movie-lists.now-playing}")
    private String nowPlayingUrl;

    private final TmdbHttpClient tmdbHttpClient;

    @Override
    public TmdbPageableMovies fetchPageable(int page) {
        String url = nowPlayingUrl + "?language=ko-KR&page" + page;
        String request = tmdbHttpClient.request(url, HttpMethod.GET, CollectionUtils.toMultiValueMap(Map.of()), Map.of());

        return null;
    }
}

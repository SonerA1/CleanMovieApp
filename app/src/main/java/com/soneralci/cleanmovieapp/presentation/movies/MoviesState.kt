package com.soneralci.cleanmovieapp.presentation.movies

import com.soneralci.cleanmovieapp.domain.model.Movie

data class MoviesState(
    val isLoading: Boolean = false,
    val movies: List<Movie> = emptyList(),
    val error : String = "",
    val search : String = "batman"
)


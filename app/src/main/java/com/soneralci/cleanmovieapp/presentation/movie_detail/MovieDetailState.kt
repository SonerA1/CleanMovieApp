package com.soneralci.cleanmovieapp.presentation.movie_detail

import com.soneralci.cleanmovieapp.domain.model.Movie
import com.soneralci.cleanmovieapp.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading: Boolean = false,
    val movie: MovieDetail? = null,
    val error: String = "",

    )
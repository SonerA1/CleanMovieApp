package com.soneralci.cleanmovieapp.domain.repository

import com.soneralci.cleanmovieapp.data.remote.dto.MovieDetailDto
import com.soneralci.cleanmovieapp.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(search : String) : MoviesDto

    suspend fun getMovieDetail(imdbId : String) : MovieDetailDto


}
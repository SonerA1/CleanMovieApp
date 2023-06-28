package com.soneralci.cleanmovieapp.data.repository

import com.soneralci.cleanmovieapp.data.remote.MovieAPI
import com.soneralci.cleanmovieapp.data.remote.dto.MovieDetailDto
import com.soneralci.cleanmovieapp.data.remote.dto.MoviesDto
import com.soneralci.cleanmovieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieReposityoryImpl @Inject constructor(
    private val api : MovieAPI
):  MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {

        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetail(imbdId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imbdId)
    }
}
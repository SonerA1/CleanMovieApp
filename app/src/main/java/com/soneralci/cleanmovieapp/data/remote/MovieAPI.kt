package com.soneralci.cleanmovieapp.data.remote

import com.soneralci.cleanmovieapp.data.remote.dto.MovieDetailDto
import com.soneralci.cleanmovieapp.data.remote.dto.MoviesDto
import com.soneralci.cleanmovieapp.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    //https://www.omdbapi.com/?apikey=a91cf7dc&s=batman
    //https://www.omdbapi.com/?apikey=a91cf7dc&i=tt0372784

    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString : String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MoviesDto

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbId : String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MovieDetailDto
}
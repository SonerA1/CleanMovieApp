package com.soneralci.cleanmovieapp.domain.use_case.get_movie_detail

import com.soneralci.cleanmovieapp.data.remote.dto.toMovieDetail
import com.soneralci.cleanmovieapp.data.remote.dto.toMovieList
import com.soneralci.cleanmovieapp.domain.model.Movie
import com.soneralci.cleanmovieapp.domain.model.MovieDetail
import com.soneralci.cleanmovieapp.domain.repository.MovieRepository
import com.soneralci.cleanmovieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetMovieDetailsUseCase @Inject constructor(private val repository : MovieRepository) {
    //Use case -> only one major public function, one feature, single responsibility

    fun executeGetMovieDetails(imdbId: String) : Flow<Resource<MovieDetail>> = flow {
        try {
            emit(Resource.Loading())
            val movieDetail = repository.getMovieDetail(imdbId = imdbId).toMovieDetail()
            emit(Resource.Success(movieDetail))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Error!"))
        } catch (e: IOError) {
            emit(Resource.Error(message = "Could not reach internet"))
        }
    }

}

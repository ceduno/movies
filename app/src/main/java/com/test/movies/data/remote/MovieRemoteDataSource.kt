package com.test.movies.data.remote

import javax.inject.Inject

class MovieRemoteDataSource @Inject constructor(
    private val MovieService: MovieService
): BaseDataSource() {

    suspend fun getMovies() = getResult { MovieService.getAllMovies() }
    suspend fun getMovie(id: Int) = getResult { MovieService.getMovie(id) }
}
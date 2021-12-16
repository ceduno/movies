package com.test.movies.data.remote

import com.test.movies.data.entities.Movie
import com.test.movies.data.entities.MovieList
import com.test.movies.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {
    //discover/movie?api_key=0d677b16a44d2b5a79edf325bc1ee9b7&sort_by=popularity.desc
    @GET("discover/movie")
    suspend fun getAllMovies(
        @Query("sort_by")
        sort_by: String = "popularity.desc",
        @Query("api_key")
        api_key: String = API_KEY
    ) : Response<MovieList>

    @GET("movie/{movie_id}")
    suspend fun getMovie(
        @Path("movie_id") id: Int,
        @Query("api_key")
        api_key: String = API_KEY
    ): Response<Movie>
}
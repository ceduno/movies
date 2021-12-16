package com.test.movies.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.test.movies.data.entities.Movie

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie")
    fun getAllMovies() : LiveData<List<Movie>>

    @Query("SELECT * FROM movie WHERE id = :id")
    fun getMovie(id: Int): LiveData<Movie>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(characters: List<Movie>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(character: Movie)


}
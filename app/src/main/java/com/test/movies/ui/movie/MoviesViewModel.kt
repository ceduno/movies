package com.test.movies.ui.movie

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.movies.data.repository.MovieRepository


class MoviesViewModel @ViewModelInject constructor(
    private val repository: MovieRepository
) : ViewModel() {

    val characters = repository.getMovies()
}

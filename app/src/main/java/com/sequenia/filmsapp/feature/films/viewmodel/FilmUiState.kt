package com.sequenia.filmsapp.feature.films.viewmodel

import com.sequenia.filmsapp.feature.films.data.Film
import com.sequenia.filmsapp.feature.genres.data.Genre
import com.sequenia.filmsapp.util.Status

data class FilmUiState(
    val films: List<Film>? = null,
    val status: Status = Status.Idle,
    val uniqueGenresList: List<Genre> = emptyList(),
    val selectedGenreId: Long? = null,
) {
    val isEmptyLoading: Boolean = status == Status.Loading && films.isNullOrEmpty()
    val isError: Boolean
        get() = status is Status.Error && films.isNullOrEmpty()
}
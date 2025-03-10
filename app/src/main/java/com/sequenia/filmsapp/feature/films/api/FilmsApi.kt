package com.sequenia.filmsapp.feature.films.api

import com.sequenia.filmsapp.feature.films.api.data.GetFilmsResponse
import retrofit2.http.GET

interface FilmsApi {
    @GET("films.json")
    suspend fun getFilms(): GetFilmsResponse
}
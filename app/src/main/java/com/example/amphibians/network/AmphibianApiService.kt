package com.example.amphibians.network

import retrofit2.http.GET

interface AmphibianApiService {
    @GET("amphibians")
    suspend fun getInformation(): List<Amphibian>
}
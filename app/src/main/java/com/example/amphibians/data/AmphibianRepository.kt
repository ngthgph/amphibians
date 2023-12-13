package com.example.amphibians.data

import com.example.amphibians.network.AmphibianApiService
import com.example.amphibians.network.Amphibian

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

class NetworkAmphibiansRepository(
    private val amphibianApiService: AmphibianApiService
): AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> {
        return amphibianApiService.getInformation()
    }
}
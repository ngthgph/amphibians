package com.example.amphibians.data

import com.example.amphibians.network.AmphibianApiService
import com.example.amphibians.network.AmphibianInformation

interface AmphibianInformationRepository {
    suspend fun getAmphibianInformation(): List<AmphibianInformation>
}

class NetworkAmphibianInformationRepository(
    private val amphibianApiService: AmphibianApiService
): AmphibianInformationRepository {
    override suspend fun getAmphibianInformation(): List<AmphibianInformation> {
        return amphibianApiService.getAmphibians()
    }
}
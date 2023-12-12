package com.example.amphibians.ui

import androidx.lifecycle.ViewModel
import com.example.amphibians.network.AmphibianInformation

sealed interface AmphibiansUiState {
    data class Success(val amphibians: List<AmphibianInformation>): AmphibiansUiState
    object Loading: AmphibiansUiState
    object Error: AmphibiansUiState
}

class AmphibiansViewModel: ViewModel() {
    init {
        getAmphibians()
    }
    fun getAmphibians() {
    }
}
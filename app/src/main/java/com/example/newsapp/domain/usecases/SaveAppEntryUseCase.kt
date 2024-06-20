package com.example.newsapp.domain.usecases

import com.example.newsapp.domain.manager.LocalUserManager

class SaveAppEntryUseCase(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}
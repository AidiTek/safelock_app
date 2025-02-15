package com.example.safelock.domain.repositry

import androidx.lifecycle.LiveData
import com.example.safelock.domain.data.Password

interface PasswordRepository {
    fun getAllPassword(): LiveData<List<Password>>
    suspend fun addPassword(password: Password)
    suspend fun getPasswordsByCategory(categoryId: Int):LiveData<List<Password>>
    suspend fun deletePassword(password: Password)
    suspend fun updatePssword(password: Password)
    suspend fun deletAllPasswords()

}
package com.southwest.southwestcodingchallenge.repository

interface SystemMessageRepository {
    suspend fun getSystemStatusMessage(): String?
}

class SystemMessageRepositoryImpl : SystemMessageRepository {
    override suspend fun getSystemStatusMessage(): String {

        return "System is Normal"
    }
}
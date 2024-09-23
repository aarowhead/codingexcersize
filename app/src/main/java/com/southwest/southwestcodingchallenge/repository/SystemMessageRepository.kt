package com.southwest.southwestcodingchallenge.repository

interface SystemMessageRepository {
    suspend fun getSystemStatusMessage(): String?
}

class MockSystemMessageRepository : SystemMessageRepository {
    override suspend fun getSystemStatusMessage(): String {
        return "Login successful"
    }
}
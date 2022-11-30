package ktor

import io.ktor.client.*
import models.Game

class KtorGamesDataSource(val httpClient: HttpClient) {
    suspend fun fetchAllGames(): List<Game> {
        return emptyList()
    }

    suspend fun searchGames(query: String): Game {
        return Game("1", "Warcraft")
    }
}
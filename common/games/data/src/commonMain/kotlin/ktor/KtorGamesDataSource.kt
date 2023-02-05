package ktor

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import ktor.models.KtorSearchGame
import ktor.models.KtorSearchRequest
import ktor.settings.SettingsAuthDataSource

class KtorGamesDataSource(
  private val httpClient: HttpClient,
  private val cacheDataSource: SettingsAuthDataSource
) {
  suspend fun fetchAllGames(): List<KtorSearchGame> {
    return httpClient.post {
      header("Bearer-Authorization", cacheDataSource.fetchToken())
      url {
        path("/games/search")
        setBody(KtorSearchRequest(searchQuery = ""))
      }
    }.body()
  }

  suspend fun searchGames(query: String): List<KtorSearchGame> {
    return httpClient.post {
      header("Bearer-Authorization", cacheDataSource.fetchToken())
      url {
        path("/games/search")
        setBody(KtorSearchRequest(searchQuery = query))
      }
    }.body()
  }
}
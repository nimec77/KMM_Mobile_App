import models.CreateGameInfo
import models.Game

interface GamesRepository {
    suspend fun fetchAllGames(): List<Game>
    suspend fun searchGames(query: String): List<Game>

    suspend fun createGame(game: CreateGameInfo)
}
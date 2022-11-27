import models.Game

interface GamesRepository {
    suspend fun fetchAllGames(): List<Game>
    suspend fun searchGames(query: String): Game
}
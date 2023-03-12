import ktor.KtorGamesDataSource
import ktor.models.mapToGame
import models.CreateGameInfo
import models.Game

class GamesRepositoryImpl(
    private val remoteDataSource: KtorGamesDataSource,
) : GamesRepository {
    override suspend fun fetchAllGames(): List<Game> {
        return remoteDataSource.fetchAllGames().map { it.mapToGame() }
    }

    override suspend fun searchGames(query: String): List<Game> {
        return remoteDataSource.searchGames(query).map {
            it.mapToGame()
        }
    }

    override suspend fun createGame(game: CreateGameInfo) {
        remoteDataSource.createGame(game)
    }
}
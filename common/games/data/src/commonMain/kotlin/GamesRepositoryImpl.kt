import ktor.KtorGamesDataSource
import ktor.models.mapToGame
import models.Game
import sqldelight.SqlDelightGamesDataSource

class GamesRepositoryImpl(
    private val remoteDataSource: KtorGamesDataSource,
    private val localDataSource: SqlDelightGamesDataSource,
) : GamesRepository {
    override suspend fun fetchAllGames(): List<Game> {
        return remoteDataSource.fetchAllGames().map { it.mapToGame() }
    }

    override suspend fun searchGames(query: String): List<Game> {
        return remoteDataSource.searchGames(query).map {
            it.mapToGame()
        }
    }
}
import ktor.KtorGamesDataSource
import models.Game
import sqldelight.SqlDelightGamesDataSource

class GamesRepositoryImpl(
    private val remoteDataSource: KtorGamesDataSource,
    private val localDataSource: SqlDelightGamesDataSource,
) : GamesRepository {
    override suspend fun fetchAllGames(): List<Game> {
        return remoteDataSource.fetchAllGames()
    }

    override suspend fun searchGames(query: String): Game {
        return remoteDataSource.searchGames(query)
    }
}
import ktor.KtorAuthRemoteDataSource
import ktor.KtorLoginRequest
import models.Token

class AuthRepositoryImpl(
    private val remoteDataSource: KtorAuthRemoteDataSource
) : AuthRepository {
    override suspend fun login(login: String, password: String): Token {
        val token = remoteDataSource.performLogin(
            request = KtorLoginRequest(
                login = login,
                password = password
            )
        )

        return token
    }

    override fun isUserLoggedIn(): Boolean {
        return true
    }
}
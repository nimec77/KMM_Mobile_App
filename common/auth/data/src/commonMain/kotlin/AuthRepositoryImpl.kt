import ktor.KtorAuthRemoteDataSource
import ktor.KtorLoginRequest
import ktor.settings.SettingsAuthDataSource
import models.Token

class AuthRepositoryImpl(
    private val remoteDataSource: KtorAuthRemoteDataSource,
    private val loadDataSource: SettingsAuthDataSource
) : AuthRepository {
    override suspend fun login(login: String, password: String): Token {

        val token = remoteDataSource.performLogin(
            request = KtorLoginRequest(
                login = login,
                password = password
            )
        )

        loadDataSource.saveToken(token = token.token)

        return token
    }

    override fun isUserLoggedIn(): Boolean {
        return loadDataSource.fetchToken().isNotBlank()
    }

    override fun loadToken(): String {
        return loadDataSource.fetchToken()
    }
}
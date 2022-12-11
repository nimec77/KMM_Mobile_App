package login

import GamesRepository
import com.adeo.kviewmodel.BaseSharedViewModel
import di.Inject
import login.models.LoginAction
import login.models.LoginEvent
import login.models.LoginViewState

class LoginViewModel : BaseSharedViewModel<LoginViewState, LoginAction, LoginEvent>(
    initialState = LoginViewState(email = "", password = "")
) {
    private val gamesRepository: GamesRepository = Inject.instance()

    override fun obtainEvent(viewEvent: LoginEvent) {
        when (viewEvent) {
            is LoginEvent.LoginClicked -> sendLogin()
            is LoginEvent.EmailChanged -> obtainEmailChanged(viewEvent.value)
            is LoginEvent.ForgotClicked -> openForgot()
            is LoginEvent.PasswordChanged -> obtainPasswordChanged(viewEvent.value)
            is LoginEvent.RegistrationClicked -> openRegistration()
        }
    }

    private fun openRegistration() {
        viewAction = LoginAction.OpenRegistrationScreen
    }

    private fun openForgot() {
        viewAction = LoginAction.OpenForgotPasswordScreen
    }

    private fun obtainPasswordChanged(value: String) {
        viewState = viewState.copy(password = value)
    }

    private fun obtainEmailChanged(value: String) {
        viewState = viewState.copy(email = value)
    }

    private fun sendLogin() {
        viewState = viewState.copy(isSending = true)
    }
}
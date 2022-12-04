package login.models

sealed class LoginAction {
    object OpenRegistrationScreen : LoginAction()
}

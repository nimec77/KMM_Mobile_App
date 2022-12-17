package login.models

sealed class LoginEvent {
    data class EmailChanged(val value: String) : LoginEvent()
    data class PasswordChanged(val value: String) : LoginEvent()
    object PasswordShowClicked : LoginEvent()
    object LoginClicked : LoginEvent()
    object RegistrationClicked : LoginEvent()
    object ForgotClicked : LoginEvent()
}

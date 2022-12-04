package login

import com.adeo.kviewmodel.BaseSharedViewModel
import login.models.LoginAction
import login.models.LoginEvent
import login.models.LoginViewState

class LoginViewModel : BaseSharedViewModel<LoginViewState, LoginAction, LoginEvent>(
    initialState = LoginViewState(email = "", password = "")
) {
    override fun obtainEvent(viewEvent: LoginEvent) {
        TODO("Not yet implemented")
    }
}
package admin.gamecreate

import AuthRepository
import GamesRepository
import admin.gamecreate.models.CreateGameAction
import admin.gamecreate.models.CreateGameEvent
import admin.gamecreate.models.CreateGameViewState
import com.adeo.kviewmodel.BaseSharedViewModel
import di.Inject
import kotlinx.coroutines.launch

class CreateGameViewModel : BaseSharedViewModel<CreateGameViewState, CreateGameAction, CreateGameEvent>(
  initialState = CreateGameViewState()
) {
  private val gamesRepository: GamesRepository = Inject.instance()
  private val authRepository: AuthRepository = Inject.instance()
  override fun obtainEvent(viewEvent: CreateGameEvent) {
    when(viewEvent) {
      CreateGameEvent.SubmitCreation -> sendGameInfo()
      is CreateGameEvent.TitleChanged -> viewState = viewState.copy(title = viewEvent.value)
      is CreateGameEvent.DescriptionChanged -> viewState = viewState.copy(description = viewEvent.value)
      is CreateGameEvent.VersionChanged -> viewState = viewState.copy(version = viewEvent.value)
      is CreateGameEvent.SizeChanged -> viewState = viewState.copy(size = viewEvent.value)
    }
  }

  private fun sendGameInfo() {
    viewModelScope.launch {
      viewState = viewState.copy(isSending = true)
      try {
//        gamesRepository.createGame(
//          game = CreateGameInfo(title = viewState.title,
//          description = viewState.description,
//          version = viewState.version,
//          size = viewState.size
//        ),
//          token = authRepository.loadToken()
//        )
      } catch (e: Exception) {
       viewState = viewState.copy(isSending = false)
      }
    }
  }
}
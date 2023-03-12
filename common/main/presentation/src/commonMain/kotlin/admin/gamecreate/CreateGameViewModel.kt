package admin.gamecreate

import GamesRepository
import admin.gamecreate.models.CreateGameAction
import admin.gamecreate.models.CreateGameEvent
import admin.gamecreate.models.CreateGameViewState
import com.adeo.kviewmodel.BaseSharedViewModel
import di.Inject
import kotlinx.coroutines.launch
import models.CreateGameInfo

class CreateGameViewModel : BaseSharedViewModel<CreateGameViewState, CreateGameAction, CreateGameEvent>(
  initialState = CreateGameViewState()
) {
  private val gamesRepository: GamesRepository = Inject.instance()
  override fun obtainEvent(viewEvent: CreateGameEvent) {
    when (viewEvent) {
      CreateGameEvent.SubmitCreation -> sendGameInfo()
      is CreateGameEvent.NameChanged -> viewState = viewState.copy(name = viewEvent.value)
      is CreateGameEvent.DescriptionChanged -> viewState = viewState.copy(description = viewEvent.value)
      is CreateGameEvent.VersionChanged -> viewState = viewState.copy(version = viewEvent.value)
      is CreateGameEvent.SizeChanged -> viewState = viewState.copy(size = viewEvent.value)
    }
  }

  private fun sendGameInfo() {
    viewModelScope.launch {
      viewState = viewState.copy(isSending = true)
      try {
        gamesRepository.createGame(
          game = CreateGameInfo(
            name = viewState.name,
            description = viewState.description,
            version = viewState.version,
            size = viewState.size
          )
        )

        viewState = viewState.copy(isSending = false)
        viewAction = CreateGameAction.CloseScreen
      } catch (e: Exception) {
        viewState = viewState.copy(isSending = false)
      }
    }
  }
}
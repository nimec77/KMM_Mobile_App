package admin.gamecreate.models

sealed class CreateGameEvent {
  object SubmitCreation: CreateGameEvent()
  data class NameChanged(val value: String) : CreateGameEvent()
  data class DescriptionChanged(val value: String) : CreateGameEvent()
  data class VersionChanged(val value: String) : CreateGameEvent()
  data class SizeChanged(val value: Int) : CreateGameEvent()
}


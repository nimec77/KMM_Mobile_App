package admin.gamecreate.models

data class CreateGameViewState(
  val title: String = "",
  val description: String = "",
  val version: String = "",
  val size: Int = 0,
  val isSending: Boolean = false,
)

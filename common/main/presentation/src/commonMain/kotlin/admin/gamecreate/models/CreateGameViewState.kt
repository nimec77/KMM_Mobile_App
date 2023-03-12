package admin.gamecreate.models

import kotlinx.serialization.Serializable

@Serializable
data class CreateGameViewState(
  val name: String = "",
  val description: String = "",
  val version: String = "",
  val size: Int = 0,
  val isSending: Boolean = false,
)

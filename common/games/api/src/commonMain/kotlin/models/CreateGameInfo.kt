package models

import kotlinx.serialization.Serializable

@Serializable
data class CreateGameInfo(
  val name: String,
  val description: String,
  val version: String,
  val size: Int,
  )

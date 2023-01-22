package ktor.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import models.Game

@Serializable
data class KtorSearchGame(
    @SerialName("gameId") val gameId: String,
    @SerialName("name") val name: String,
    @SerialName("description") val description: String,
    @SerialName("version") val version: String,
    @SerialName("size") val size: Int,
)

fun KtorSearchGame.mapToGame(): Game {
    return Game(
        gameId = gameId,
        name = name,
    )
}
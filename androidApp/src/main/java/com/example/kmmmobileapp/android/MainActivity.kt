package com.example.kmmmobileapp.android

import GamesRepository
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import di.Inject.instance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)

        val gamesRepository = instance<GamesRepository>()
        CoroutineScope(context = Dispatchers.IO).launch {
            val game = gamesRepository.searchGames(query = "Mario")
            withContext(Dispatchers.Main) {
                Logger.getLogger("MainActivity").info("Game: $game")
            }
        }
    }
}
package com.example.kmmmobileapp.android

import GamesRepository
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import di.Inject.instance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gamesRepository = instance<GamesRepository>()
        CoroutineScope(context = Dispatchers.IO).launch {
            val game = gamesRepository.fetchAllGames().first()
            withContext(Dispatchers.Main) {
                setContent {
                    Greeting(name = game.title)
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!", color = Color.White)
    }
}
package navigation

import SplashScreen
import androidx.compose.material.Text
import mainFlow
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder
import theme.Theme

fun RootComposeBuilder.generateGraph() {
    screen(name = NavigationTree.Splash.SplashScreen.name) {
        SplashScreen()
    }

    screen(name = NavigationTree.Main.Game.name) {
        Text("Hello, Game", color = Theme.colors.secondaryTextColor)
    }

    authFlow()
    mainFlow()
}
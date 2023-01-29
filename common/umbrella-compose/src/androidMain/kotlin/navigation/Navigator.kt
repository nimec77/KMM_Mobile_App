package navigation

import SplashScreen
import mainFlow
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.generateGraph() {
    screen(name = NavigationTree.Splash.SplashScreen.name) {
        SplashScreen()
    }

    authFlow()
    mainFlow()
}
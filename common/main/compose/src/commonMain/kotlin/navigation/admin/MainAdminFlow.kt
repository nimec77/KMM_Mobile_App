package navigation.admin

import admin.events.EventsAdminScreen
import admin.games.GamesAdminScreen
import admin.gamescreate.CreateGameScreen
import navigation.NavigationTree
import navigation.tabs.BottomConfiguration
import navigation.tabs.EventsTab
import navigation.tabs.GamesTab
import ru.alexgladkov.odyssey.compose.extensions.bottomNavigation
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.extensions.tab
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.mainAdminFlow() {
  bottomNavigation(
    name = NavigationTree.Desktop.Dashboard.name,
    tabsNavModel = BottomConfiguration()
  ) {
    tab(GamesTab()) {
      screen(name = NavigationTree.Desktop.Games.name) {
        GamesAdminScreen()
      }

      screen(name = NavigationTree.Desktop.CreateGame.name) {
        CreateGameScreen()
      }
    }

    tab(EventsTab()) {
      screen(name = NavigationTree.Desktop.Events.name) {
        EventsAdminScreen()
      }
    }
  }
}
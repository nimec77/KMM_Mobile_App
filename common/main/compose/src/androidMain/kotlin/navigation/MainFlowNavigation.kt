import navigation.NavigationTree
import navigation.tabs.*
import ru.alexgladkov.odyssey.compose.extensions.bottomNavigation
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.extensions.tab
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.mainFlow() {
  bottomNavigation(
    name = NavigationTree.Main.Dashboard.name,
    tabsNavModel = BottomConfiguration()
  ) {
    tab(HomeTab()) {
      screen(name = NavigationTree.Main.Home.name) {
      }
    }

    tab(SearchTab()) {
      screen(name = NavigationTree.Main.Search.name) {
      }
    }

    tab(EventsTab()) {
      screen(name = NavigationTree.Main.Event.name) {
      }
    }

    tab(VideosTab()) {
      screen(name = NavigationTree.Main.Videos.name) {
      }
    }
  }
}
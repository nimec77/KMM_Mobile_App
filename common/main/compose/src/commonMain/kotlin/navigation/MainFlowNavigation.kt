import androidx.compose.material.Text
import home.HomeScreen
import navigation.NavigationTree
import navigation.tabs.*
import ru.alexgladkov.odyssey.compose.extensions.bottomNavigation
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.extensions.tab
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder
import search.SearchScreen
import theme.Theme

fun RootComposeBuilder.mainFlow() {
  bottomNavigation(
    name = NavigationTree.Main.Dashboard.name,
    tabsNavModel = BottomConfiguration()
  ) {
    tab(HomeTab()) {
      screen(name = NavigationTree.Main.Home.name) {
        HomeScreen()
      }

      screen(name = NavigationTree.Main.Profile.name) {
        Text("Hello, Profile", color = Theme.colors.secondaryTextColor)
      }
    }

    tab(SearchTab()) {
      screen(name = NavigationTree.Main.Search.name) {
        SearchScreen()
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
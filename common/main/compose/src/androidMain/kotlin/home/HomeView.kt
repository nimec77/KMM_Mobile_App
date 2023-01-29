package home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import home.models.HomeEvent
import home.models.HomeViewState

@Composable
fun HomeView(viewState: HomeViewState, eventHandler: (HomeEvent) -> Unit) {
  Row(
    modifier = Modifier.clickable {
      eventHandler.invoke(HomeEvent.UserProfileClicked)
    }.padding(start = 24.dp, end = 24.dp, top = 26.dp)
  ) {
  }
}
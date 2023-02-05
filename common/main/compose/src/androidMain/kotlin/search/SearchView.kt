package search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import search.models.SearchEvent
import search.models.SearchViewState
import theme.Theme

@Composable
fun SearchView(viewState: SearchViewState, eventHandler: (SearchEvent) -> Unit) {
  Column {
    TextField(
      modifier = Modifier.padding(16.dp)
        .fillMaxWidth()
        .height(56.dp),
      value = viewState.query,
      colors = TextFieldDefaults.textFieldColors(
        backgroundColor = Theme.colors.textFieldBackground,
        textColor = Theme.colors.textFieldTextColor,
        cursorColor = Theme.colors.highlightTextColor,
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
      ),
      placeholder = {Text("Search Game", color = Theme.colors.hintTextColor)},
      shape = RoundedCornerShape(10.dp),
      onValueChange = { eventHandler.invoke(SearchEvent.QueryChanged(it)) }
    )

    LazyColumn {
      viewState.games.forEach {
        item {
          Text(
            modifier = Modifier.clickable { eventHandler.invoke(SearchEvent.GameClicked) }
              .padding(16.dp),
            text = it.name,
            color = Theme.colors.secondaryTextColor,
            fontWeight = FontWeight.Medium,
          )
        }
      }
    }
  }
}
package widgets

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import theme.Theme

@Composable
fun CommonTextField(
  value: String,
  placeholder: String,
  isSending: Boolean = false,
  isTextHidden: Boolean = false,
  trailingIcon: @Composable (() -> Unit) = {},
  onValueChange: (String) -> Unit,
) {
  TextField(
    modifier = Modifier
      .fillMaxWidth()
      .height(56.dp),
    value = value,
    enabled = !isSending,
    colors = TextFieldDefaults.textFieldColors(
      backgroundColor = Theme.colors.textFieldBackground,
      textColor = Theme.colors.textFieldTextColor,
      cursorColor = Theme.colors.textFieldTextColor,
      focusedIndicatorColor = Color.Transparent,
      unfocusedIndicatorColor = Color.Transparent,
      disabledIndicatorColor = Color.Transparent,
    ),
    visualTransformation = if (isTextHidden) {
      PasswordVisualTransformation()
    } else {
      VisualTransformation.None
    },
    trailingIcon = {
      trailingIcon()
    },
    placeholder = { Text(placeholder, color = Theme.colors.hintTextColor)},
    shape = RoundedCornerShape(18.dp),
    onValueChange = { onValueChange.invoke(it)},
  )
}
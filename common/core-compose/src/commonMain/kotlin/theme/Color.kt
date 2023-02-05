package theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class PlayzoneColors(
    var primaryBackground: Color,
    var primaryAction: Color,
    var primaryTextColor: Color,
    val hintTextColor: Color,
    val highlightTextColor: Color,
    val secondaryTextColor: Color,
    val thirdTextColor: Color,
    val tagColor: Color,
    val tagTextColor: Color,
    val textFieldBackground: Color,
    val textFieldTextColor: Color,
)

val palette = PlayzoneColors(
    primaryBackground = Color(0xFF050B18),
    primaryAction = Color(0xFFF4D144),
    primaryTextColor = Color(0xFF050B18),
    hintTextColor = Color(0xFF696C75),
    highlightTextColor = Color(0xFFF4D144),
    secondaryTextColor = Color(0xFFFFFFFF),
    thirdTextColor = Color(0xFFEEF2FB),
    tagColor = Color(0x1844A9F4),
    tagTextColor = Color(0xFF44A9F4),
    textFieldBackground = Color(0xFF1F2430),
    textFieldTextColor = Color(0xFF696C75),
)

val LocalColorProvider =
    staticCompositionLocalOf<PlayzoneColors> { error("No default implementation") }
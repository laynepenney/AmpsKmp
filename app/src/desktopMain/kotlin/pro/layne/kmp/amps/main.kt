package pro.layne.kmp.amps

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Amps2",
    ) {
        App()
    }
}
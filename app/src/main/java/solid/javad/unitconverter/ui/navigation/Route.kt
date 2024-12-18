package solid.javad.unitconverter.ui.navigation

import kotlinx.serialization.Serializable
import solid.javad.unitconverter.core.Quantity

@Serializable
sealed class Route {
    data object MainScreen : Route()
    data class ConvertScreen(val quantity: Quantity): Route()
}
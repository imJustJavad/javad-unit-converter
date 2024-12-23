package solid.javad.unitconverter.ui.navigation

import kotlinx.serialization.Serializable
import solid.javad.unitconverter.core.QuantityType

@Serializable
sealed class Route {
    data object MainScreen : Route()
    data class ConvertScreen(val quantityType: QuantityType): Route()
}
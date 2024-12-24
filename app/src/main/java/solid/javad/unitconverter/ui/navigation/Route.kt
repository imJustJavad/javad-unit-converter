package solid.javad.unitconverter.ui.navigation

import kotlinx.serialization.Serializable
import solid.javad.unitconverter.core.QuantityType

@Serializable
sealed class Route {
    @Serializable
    data object MainScreen : Route()

    @Serializable
    data class ConvertScreen(val quantityType: QuantityType): Route()
}
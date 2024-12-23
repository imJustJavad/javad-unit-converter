package solid.javad.unitconverter.core.quantities

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.Unit

object Density : Quantity {
    override val units = listOf(
        Unit(
            name = "Grams per Cubic Millimetre",
            toMainUnit = { it / (1000.0 * 1000.0 * 1000.0) },
            fromMainUnit = { it * (1000.0 * 1000.0 * 1000.0) }
        ),
        Unit(
            name = "Kilograms per Litre",
            toMainUnit = { it / 1000.0 },
            fromMainUnit = { it * 1000.0 }
        ),
        Unit(
            name = "Tonnes per Cubic Metre",
            toMainUnit = { it * 1.0 },
            fromMainUnit = { it / 1.0 }
        )
    )
}
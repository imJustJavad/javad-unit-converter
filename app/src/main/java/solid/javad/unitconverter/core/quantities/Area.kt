package solid.javad.unitconverter.core.quantities

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.Unit

object Area : Quantity {
    override val units = listOf(
        Unit(
            name = "Square Millimetre",
            toMainUnit = { it / (1000.0 * 1000.0) },
            fromMainUnit = { it * (1000.0 * 1000.0) }
        ),
        Unit(
            name = "Square Centimetre",
            toMainUnit = { it / (100.0 * 100.0) },
            fromMainUnit = { it * (100.0 * 100.0) }
        ),
        Unit(
            name = "Square Decimetre",
            toMainUnit = { it / (10.0 * 10.0) },
            fromMainUnit = { it * (10.0 * 10.0) }
        ),
        Unit(
            name = "Square Kilometre",
            toMainUnit = { it / (0.001 * 0.001) },
            fromMainUnit = { it * (0.001 * 0.001) }
        ),
        Unit(
            name = "Square Inch",
            toMainUnit = { it * (0.0254 * 0.0254) },
            fromMainUnit = { it / (0.0254 * 0.0254) }
        ),
        Unit(
            name = "Square Foot",
            toMainUnit = { it * (0.3048 * 0.3048) },
            fromMainUnit = { it / (0.3048 * 0.3048) }
        ),
        Unit(
            name = "Square Yard",
            toMainUnit = { it * (0.9144 * 0.9144) },
            fromMainUnit = { it / (0.9144 * 0.9144) }
        ),
        Unit(
            name = "Square Mile",
            toMainUnit = { it * (1609.344 * 1609.344) },
            fromMainUnit = { it / (1609.344 * 1609.344) }
        )
    )
}
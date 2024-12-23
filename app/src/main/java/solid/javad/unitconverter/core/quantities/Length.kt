package solid.javad.unitconverter.core.quantities

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.Unit

object Length : Quantity {
    override val units = listOf(
        Unit(
            name = "Metre",
            toMainUnit = { it },
            fromMainUnit = { it }
        ),
        Unit(
            name = "Millimetre",
            toMainUnit = { it / 1000.0 },
            fromMainUnit = { it * 1000.0 }
        ),
        Unit(
            name = "Centimetre",
            toMainUnit = { it / 100.0 },
            fromMainUnit = { it * 100.0 }
        ),
        Unit(
            name = "Decimetre",
            toMainUnit = { it / 10.0 },
            fromMainUnit = { it * 10.0 }
        ),
        Unit(
            name = "Kilometre",
            toMainUnit = { it / 0.001 },
            fromMainUnit = { it * 0.001 }
        ),
        Unit(
            name = "Inch",
            toMainUnit = { it / 0.0254 },
            fromMainUnit = { it * 0.0254 }
        ),
        Unit(
            name = "Foot",
            toMainUnit = { it / 0.3048 },
            fromMainUnit = { it * 0.3048 }
        ),
        Unit(
            name = "Yard",
            toMainUnit = { it / 0.9144 },
            fromMainUnit = { it * 0.9144 }
        ),
        Unit(
            name = "Mile",
            toMainUnit = { it / 1609.344 },
            fromMainUnit = { it * 1609.344 }
        )
    )
}

package solid.javad.unitconverter.core.quantities

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.Unit

object Mass : Quantity {
    override val units = listOf(
        Unit(
            name = "Gram",
            toMainUnit = { it },
            fromMainUnit = { it }
        ),
        Unit(
            name = "Milligram",
            toMainUnit = { it / 1000.0 },
            fromMainUnit = { it * 1000.0 }
        ),
        Unit(
            name = "Kilogram",
            toMainUnit = { it * 1000.0 },
            fromMainUnit = { it / 1000.0 }
        ),
        Unit(
            name = "Tonne",
            toMainUnit = { it * 1000000.0 },
            fromMainUnit = { it / 1000000.0 }
        )
    )
}
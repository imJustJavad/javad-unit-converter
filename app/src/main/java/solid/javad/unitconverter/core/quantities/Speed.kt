package solid.javad.unitconverter.core.quantities

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.Unit

object Speed : Quantity {
    override val units = listOf(
        Unit(
            "Kilometre per Hour",
            toMainUnit = { it / 3.6 },
            fromMainUnit = { it * 3.6 }
        ),
        Unit(
            "Mile per Hour",
            toMainUnit = { it / 0.44704 },
            fromMainUnit = { it * 0.44704 }
        )
    )
}
package solid.javad.unitconverter.core.quantities

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.Unit

object Energy : Quantity {
    override val units = listOf(
        Unit(
            name = "Joule",
            toMainUnit = { it },
            fromMainUnit = { it }
        ),
        Unit(
            name = "Kilojoule",
            toMainUnit = { it / 1000.0 },
            fromMainUnit = { it * 1000.0 }
        ),
        Unit(
            name = "Calorie",
            toMainUnit = { it / 4.184 },
            fromMainUnit = { it * 4.184 }
        ),
        Unit(
            name = "Kilocalorie",
            toMainUnit = { it / 4184.0 },
            fromMainUnit = { it * 4184.0 }
        )
    )
}
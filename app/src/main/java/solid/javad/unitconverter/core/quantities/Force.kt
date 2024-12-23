package solid.javad.unitconverter.core.quantities

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.Unit

object Force : Quantity {
    override val units = listOf(
        Unit(
            name = "Newton",
            toMainUnit = { it },
            fromMainUnit = { it }
        ),
        Unit(
            name = "Kilonewton",
            toMainUnit = { it / 1000.0 },
            fromMainUnit = { it * 1000.0 }
        ),
        Unit(
            name = "Dyne",
            toMainUnit = { it / 100000.0 },
            fromMainUnit = { it * 100000.0 }
        ),
        Unit(
            name = "Pound",
            toMainUnit = { it / 4.448222 },
            fromMainUnit = { it * 4.448222 }
        ),
        Unit(
            name = "Poundal",
            toMainUnit = { it * 0.1382550 },
            fromMainUnit = { it / 0.1382550 }
        ),
        Unit(
            name = "Kip",
            toMainUnit = { it / (1000.0 * 4.44822) },
            fromMainUnit = { it * (1000.0 * 4.44822) }
        )
    )
}
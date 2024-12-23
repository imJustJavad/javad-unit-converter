package solid.javad.unitconverter.core.quantities

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.Unit

object Moment : Quantity {
    override val units = listOf(
        Unit(
            name = "Second",
            toMainUnit = { it },
            fromMainUnit = { it }
        ),
        Unit(
            name = "Millisecond",
            toMainUnit = { it / 1000.0 },
            fromMainUnit = { it * 1000.0 }
        ),
        Unit(
            name = "Minute",
            toMainUnit = { it * 60.0 },
            fromMainUnit = { it / 60.0 }
        ),
        Unit(
            name = "Hour",
            toMainUnit = { it * 3600.0 },
            fromMainUnit = { it / 3600.0 }
        ),
        Unit(
            name = "Day",
            toMainUnit = { it * 86400.0 },
            fromMainUnit = { it / 86400.0 }
        ),
        Unit(
            name = "Week",
            toMainUnit = { it * 604800.0 },
            fromMainUnit = { it / 604800.0 }
        ),
        Unit(
            name = "Month (30 Days)",
            toMainUnit = { it * 2592000.0 },
            fromMainUnit = { it / 2592000.0 }
        ),
        Unit(
            name = "Year (365 Days)",
            toMainUnit = { it * 31536000.0 },
            fromMainUnit = { it / 31536000.0 }
        )
    )
}

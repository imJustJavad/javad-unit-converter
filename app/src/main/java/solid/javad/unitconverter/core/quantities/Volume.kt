package solid.javad.unitconverter.core.quantities

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.Unit
import kotlin.math.pow

object Volume : Quantity {
    override val units = listOf(
        Unit(
            "Millimetre Cubed",
            toMainUnit = { it / 1000.0.pow(3.0) },
            fromMainUnit = { it * 1000.0.pow(3.0) }
        ),
        Unit(
            "Centimetre Cubed",
            toMainUnit = { it / 100.0.pow(3.0) },
            fromMainUnit = { it * 100.0.pow(3.0) }
        ),
        Unit(
            "Decimetre Cubed",
            toMainUnit = { it / 10.0.pow(3.0) },
            fromMainUnit = { it * 10.0.pow(3.0) }
        ),
        Unit(
            "Kilometre Cubed",
            toMainUnit = { it / 0.001.pow(3.0) },
            fromMainUnit = { it * 0.001.pow(3.0) }
        ),
        Unit(
            "Inch Cubed",
            toMainUnit = { it / 0.0254.pow(3.0) },
            fromMainUnit = { it * 0.0254.pow(3.0) }
        ),
        Unit(
            "Foot Cubed",
            toMainUnit = { it / 0.3048.pow(3.0) },
            fromMainUnit = { it * 0.3048.pow(3.0) }
        ),
        Unit(
            "Yard Cubed",
            toMainUnit = { it / 0.9144.pow(3.0) },
            fromMainUnit = { it * 0.9144.pow(3.0) }
        ),
        Unit(
            "Mile Cubed",
            toMainUnit = { it / 1609.344.pow(3.0) },
            fromMainUnit = { it * 1609.344.pow(3.0) }
        )
    )
}

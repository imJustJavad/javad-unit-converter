package solid.javad.unitconverter.core

import solid.javad.unitconverter.core.quantities.Area
import solid.javad.unitconverter.core.quantities.Density
import solid.javad.unitconverter.core.quantities.Energy
import solid.javad.unitconverter.core.quantities.Force
import solid.javad.unitconverter.core.quantities.Length
import solid.javad.unitconverter.core.quantities.Moment
import solid.javad.unitconverter.core.quantities.Speed
import solid.javad.unitconverter.core.quantities.Volume

enum class QuantityType {
    AREA,
    DENSITY,
    ENERGY,
    FORCE,
    LENGTH,
    MOMENT,
    SPEED,
    VOLUME;

    fun getQuantity(): Quantity {
        return when (this) {
            AREA -> Area
            DENSITY -> Density
            ENERGY -> Energy
            FORCE -> Force
            LENGTH -> Length
            MOMENT -> Moment
            SPEED -> Speed
            VOLUME -> Volume
        }
    }
}
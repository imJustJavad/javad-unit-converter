package solid.javad.unitconverter.ui.screen

import solid.javad.unitconverter.R
import solid.javad.unitconverter.core.QuantityType

val quantityItems = listOf (
    QuantityItem(
        quantityType = QuantityType.LENGTH,
        name = "Length",
        resource = R.drawable.length
    ),
    QuantityItem(
        quantityType = QuantityType.AREA,
        name = "Area",
        resource = R.drawable.area
    ),
    QuantityItem(
        quantityType = QuantityType.VOLUME,
        name = "Volume",
        resource = R.drawable.volume
    ),
    QuantityItem(
        quantityType = QuantityType.ENERGY,
        name = "Energy",
        resource = R.drawable.energy
    ),
    QuantityItem(
        quantityType = QuantityType.FORCE,
        name = "Force",
        resource = R.drawable.force
    ),
    QuantityItem(
        quantityType = QuantityType.MASS,
        name = "Mass",
        resource = R.drawable.mass
    ),
    QuantityItem(
        quantityType = QuantityType.DENSITY,
        name = "Density",
        resource = R.drawable.density
    ),
    QuantityItem(
        quantityType = QuantityType.SPEED,
        name = "Speed",
        resource = R.drawable.speed
    ),
    QuantityItem(
        quantityType = QuantityType.MOMENT,
        name = "Moment",
        resource = R.drawable.moment
    )
)

class QuantityItem (
    val quantityType: QuantityType,
    val name: String,
    val resource: Int
)
package solid.javad.unitconverter.ui.screen

import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.quantities.Area
import solid.javad.unitconverter.R
import solid.javad.unitconverter.core.quantities.Density
import solid.javad.unitconverter.core.quantities.Energy
import solid.javad.unitconverter.core.quantities.Force
import solid.javad.unitconverter.core.quantities.Length
import solid.javad.unitconverter.core.quantities.Mass
import solid.javad.unitconverter.core.quantities.Moment
import solid.javad.unitconverter.core.quantities.Speed
import solid.javad.unitconverter.core.quantities.Volume

val quantityItems = listOf (
    QuantityItem(
        quantity = Length,
        name = "Lnegth",
        resource = R.drawable.length
    ),
    QuantityItem(
        quantity = Area,
        name = "Area",
        resource = R.drawable.area
    ),
    QuantityItem(
        quantity = Volume,
        name = "Volume",
        resource = R.drawable.volume
    ),
    QuantityItem(
        quantity = Energy,
        name = "Energy",
        resource = R.drawable.energy
    ),
    QuantityItem(
        quantity = Force,
        name = "Force",
        resource = R.drawable.force
    ),
    QuantityItem(
        quantity = Mass,
        name = "Mass",
        resource = R.drawable.mass
    ),
    QuantityItem(
        quantity = Density,
        name = "Density",
        resource = R.drawable.density
    ),
    QuantityItem(
        quantity = Speed,
        name = "Speed",
        resource = R.drawable.speed
    ),
    QuantityItem(
        quantity = Moment,
        name = "Moment",
        resource = R.drawable.moment
    )
)

class QuantityItem (
    val quantity: Quantity,
    val name: String,
    val resource: Int
)
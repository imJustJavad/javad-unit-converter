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
        quantity = Length(1.0),
        name = "Lnegth",
        resource = R.drawable.length
    ),
    QuantityItem(
        quantity = Area(1.0),
        name = "Area",
        resource = R.drawable.area
    ),
    QuantityItem(
        quantity = Volume(1.0),
        name = "Volume",
        resource = R.drawable.volume
    ),
    QuantityItem(
        quantity = Energy(1.0),
        name = "Energy",
        resource = R.drawable.energy
    ),
    QuantityItem(
        quantity = Force(1.0),
        name = "Force",
        resource = R.drawable.force
    ),
    QuantityItem(
        quantity = Mass(1.0),
        name = "Mass",
        resource = R.drawable.mass
    ),
    QuantityItem(
        quantity = Density(1.0),
        name = "Density",
        resource = R.drawable.density
    ),
    QuantityItem(
        quantity = Speed(1.0),
        name = "Speed",
        resource = R.drawable.speed
    ),
    QuantityItem(
        quantity = Moment(1.0),
        name = "Moment",
        resource = R.drawable.moment
    )
)

class QuantityItem (
    val quantity: Quantity,
    val name: String,
    val resource: Int
)
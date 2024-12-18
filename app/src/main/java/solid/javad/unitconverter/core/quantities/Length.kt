package solid.javad.unitconverter.core.quantities

import kotlinx.serialization.Serializable
import solid.javad.unitconverter.core.Quantity

@Serializable
class Length(val metre: Double): Quantity {
    val millimetre = metre * 1000
    val centimetre = metre * 100
    val decimetre = metre * 100
    val kilometre = metre * 0.001

    val inch = metre / 0.0254
    val foot = metre / 0.3048
    val yard = metre / 0.9144
    val mile = metre / 1609.344

    companion object {
        fun millimetre(millimetre: Double) = Length(millimetre / 1000)
        fun centimetre(centimetre: Double) = Length(centimetre / 100)
        fun decimetre(decimetre: Double) = Length(decimetre / 100)
        fun kilometre(kilometre: Double) = Length(kilometre / 0.001)

        fun inch(inch: Double) = Length(inch * 0.0254)
        fun foot(mile: Double) = Length(mile / 0.3048)
        fun yard(yard: Double) = Length(yard / 0.9144)
        fun mile(mile: Double) = Length(mile / 1609.344)
    }
}
package solid.javad.unitconverter.core.quantities

import kotlinx.serialization.Serializable
import solid.javad.unitconverter.core.Quantity

@Serializable
class Speed(val mps: Double): Quantity {
    val kph = mps / 3.6
    val mph = mps / 0.44704

    companion object {
        fun kph(kph: Double) = Speed(kph * 3.6)
        fun mph(mph: Double) = Speed(mph * 0.44704)
    }
}
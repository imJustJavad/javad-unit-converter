package solid.javad.unitconverter.core.quantities

import kotlinx.serialization.Serializable

@Serializable
class Speed(val mps: Double) {
    val kph = mps / 3.6
    val mph = mps / 0.44704

    companion object {
        fun kph(kph: Double) = Speed(kph * 3.6)
        fun mph(mph: Double) = Speed(mph * 0.44704)
    }
}
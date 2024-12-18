package solid.javad.unitconverter.core.quantities

import kotlinx.serialization.Serializable
import solid.javad.unitconverter.core.Quantity

@Serializable
class Mass(val gram: Double): Quantity {
    val milliGram = gram * 1000
    val kiloGram = gram / 1000
    val tonne = kiloGram / 1000

    companion object {
        fun milliGram(milliGram: Double) = Mass(milliGram / 1000)
        fun kiloGram(kiloGram: Double) = Mass(kiloGram * 1000)
        fun tonne(tonne: Double) = kiloGram(tonne * 1000)
    }
}
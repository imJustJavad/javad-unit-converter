package solid.javad.unitconverter.core.units

import kotlinx.serialization.Serializable

@Serializable
class Mass(val gram: Double) {
    val milliGram = gram * 1000
    val kiloGram = gram / 1000
    val tonne = kiloGram / 1000

    companion object {
        fun milliGram(milliGram: Double) = Mass(milliGram / 1000)
        fun kiloGram(kiloGram: Double) = Mass(kiloGram * 1000)
        fun tonne(tonne: Double) = kiloGram(tonne * 1000)
    }
}
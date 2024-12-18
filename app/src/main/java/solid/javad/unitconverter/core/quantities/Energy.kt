package solid.javad.unitconverter.core.quantities

import kotlinx.serialization.Serializable

@Serializable
class Energy(val joule: Double) {
    val kiloJoule = joule / 1000
    val calorie = joule / 4.184
    val kilocalorie = calorie * 1000

    companion object {
        fun kiloJoule(kiloJoule: Double) = Energy(kiloJoule * 1000)
        fun calorie(calorie: Double) = Energy(calorie * 4.184)
        fun kilocalorie(kilocalorie: Double) = Energy(kilocalorie * 4184)
    }
}
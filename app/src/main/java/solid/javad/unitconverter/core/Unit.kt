package solid.javad.unitconverter.core

data class Unit (
    val name: String,
    val toMainUnit: (Double) -> Double,
    val fromMainUnit: (Double) -> Double
)
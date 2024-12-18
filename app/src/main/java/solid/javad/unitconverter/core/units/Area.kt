package solid.javad.unitconverter.core.units

import kotlinx.serialization.Serializable
import kotlin.math.pow

@Serializable
class Area(val sMetre: Double) {
    val sMillimetre = sMetre * 1000.0.pow(2.0)
    val sCentimetre = sMetre * 100.0.pow(2.0)
    val sDecimetre = sMetre * 100.0.pow(2.0)
    val sKilometre = sMetre * 0.001.pow(2.0)

    val sInch = sMetre / 0.0254.pow(2.0)
    val sFoot = sMetre / 0.3048.pow(2.0)
    val sYard = sMetre / 0.9144.pow(2.0)
    val sMile = sMetre / 1609.344.pow(2.0)

    companion object {
        fun sMillimetre(sMillimetre: Double) = Area(sMillimetre / 1000.0.pow(2.0))
        fun sCentimetre(sCentimetre: Double) = Area(sCentimetre / 100.0.pow(2.0))
        fun sDecimetre(sDecimetre: Double) = Area(sDecimetre / 100.0.pow(2.0))
        fun sKilometre(sKilometre: Double) = Area(sKilometre / 0.001.pow(2.0))

        fun sInch(sInch: Double) = Area(sInch * 0.0254.pow(2.0))
        fun sFoot(sFoot: Double) = Area(sFoot / 0.3048.pow(2.0))
        fun sYard(sYard: Double) = Area(sYard / 0.9144.pow(2.0))
        fun sMile(sMile: Double) = Area(sMile / 1609.344.pow(2.0))
    }
}
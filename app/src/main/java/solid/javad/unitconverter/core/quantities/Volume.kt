package solid.javad.unitconverter.core.quantities

import kotlinx.serialization.Serializable
import solid.javad.unitconverter.core.Quantity
import kotlin.math.pow

@Serializable
class Volume(val qMetre: Double): Quantity {
    val qMillimetre = qMetre * 1000.0.pow(3.0)
    val qCentimetre = qMetre * 100.0.pow(3.0)
    val qDecimetre = qMetre * 100.0.pow(3.0)
    val qKilometre = qMetre * 0.001.pow(3.0)

    val qInch = qMetre / 0.0254.pow(3.0)
    val qFoot = qMetre / 0.3048.pow(3.0)
    val qYard = qMetre / 0.9144.pow(3.0)
    val qMile = qMetre / 1609.344.pow(3.0)

    val litre = qDecimetre
    val gallon get () = litre / 4.54609

    companion object {
        fun qMillimetre(qMillimetre: Double) = Volume(qMillimetre / 1000.0.pow(3.0))
        fun qCentimetre(qCentimetre: Double) = Volume(qCentimetre / 100.0.pow(3.0))
        fun qDecimetre(qDecimetre: Double) = Volume(qDecimetre / 100.0.pow(3.0))
        fun qKilometre(qKilometre: Double) = Volume(qKilometre / 0.001.pow(3.0))

        fun qInch(qInch: Double) = Volume(qInch * 0.0254.pow(3.0))
        fun qFoot(qFoot: Double) = Volume(qFoot / 0.3048.pow(3.0))
        fun qYard(qYard: Double) = Volume(qYard / 0.9144.pow(3.0))
        fun qMile(qMile: Double) = Volume(qMile / 1609.344.pow(3.0))

        fun litre(litre: Double) = qDecimetre(litre)
        fun gallon(gallon: Double) = litre(gallon * 4.54609)
    }
}
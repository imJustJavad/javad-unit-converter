package solid.javad.unitconverter.core.quantities

import kotlinx.serialization.Serializable
import java.lang.Math.pow

@Serializable
class Density(val kgpqm: Double) {
    val gpqmm = kgpqm * 1000 * pow(1000.0, 3.0)
    val kgpl = kgpqm * 1000
    val tpqm = kgpqm * 1000

    companion object {
        fun gpqmm(gpqmm: Double) = Density(gpqmm / (1000 * pow(1000.0, 3.0)))
        fun kgpl(kgpl: Double) = Density(kgpl / 1000)
    }
}
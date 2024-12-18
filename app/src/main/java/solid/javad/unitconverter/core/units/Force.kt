package solid.javad.unitconverter.core.units

class Force(val newton: Double) {
    val kiloNewton = newton / 1000

    val dyne = newton * 100000
    val pound = newton * 4.448222
    val poundal = newton / 0.1382550
    val kip = kiloNewton * 4.44822

    companion object {
        fun kiloNewton(kiloNewton: Double) = Force(kiloNewton * 1000)
        fun dyne(dyne: Double) = Force(dyne * 100000)
        fun pound(pound: Double) = Force(pound * 4.448222)
        fun poundal(poundal: Double) = Force(poundal * 0.1382550)
        fun kip(kip: Double) = Force(kip * 4.44822)
    }
}
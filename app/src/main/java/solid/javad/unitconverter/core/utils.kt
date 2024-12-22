package solid.javad.unitconverter.core

import solid.javad.unitconverter.core.quantities.Area
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.companionObject
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.memberProperties

data class Unit<T : Quantity> (
    val name: String,
    val toMainUnit: (Double) -> Double,
    val fromMainUnit: (Double) -> Double
)

fun <T : Quantity> getUnits(quantityKClass: KClass<T>, mainUnit: String): List<Unit<T>> {
    val companion = quantityKClass.companionObject!!

    return companion.declaredFunctions.filter { it.name != "serializer" }.map<KFunction<*>, Unit<T>> { function ->
        Unit (
            name = function.name,
            toMainUnit = { value ->
                val quantityInstance = function.call(companion.objectInstance, value) as T

                quantityKClass
                    .memberProperties
                    .first { it.name == mainUnit}
                    .getter
                    .call(quantityInstance) as Double
            },
            fromMainUnit = { value ->
                quantityKClass
                    .declaredMemberProperties
                    .first { it.name == function.name }
                    .getter.also{ println(it.name) }
                    .call(quantityKClass.constructors.last().call(value)) as Double
            }
        )
    }.plus (
        Unit (
            name = mainUnit,
            toMainUnit = { it },
            fromMainUnit = { it }
        )
    )
}

fun main() {
    val units = getUnits(Area::class, "sMetre")
    println(units)
}
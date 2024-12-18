package solid.javad.unitconverter.core.units

class Moment(val second: Double) {
    val milliSecond = second * 1000
    val minute = second / 60
    val hour = minute / 60
    val day = hour / 24
    val week = day / 7
    val month = day / 30
    val year = day / 365

    companion object {
        fun milliSecond(milliSecond: Double) = Moment(milliSecond / 1000)
        fun minute(minute: Double) = Moment(minute * 60)
        fun hour(hour: Double) = minute(hour * 60)
        fun day(day: Double) = hour(day * 24)
        fun week(week: Double) = day(week * 7)
        fun month(month: Double) = day(month * 30)
        fun year(year: Double) = day(year * 365)
    }
}
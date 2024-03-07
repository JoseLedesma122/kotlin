fun fallingDistance(time: Double): Double {
    val g = 9.81 
    return 0.5 * g * Math.pow(time, 2.0)
}

fun main() {
    for (i in 1..10) {
        val distance = fallingDistance(i.toDouble())
        println("Object has fallen for $i seconds, distance: $distance meters")
    }
}
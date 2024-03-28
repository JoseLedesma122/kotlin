class Vehicle(val make: String, val model: String, val year: Int,)

fun main() {
    val cp1 = Vehicle("Tesla", "S", 2012 )


    println(cp1.make)
    println(cp1.model)
    println("${cp1.year}")


}
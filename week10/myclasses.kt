class Car(var brand: String, var model: String, var year: Int){
    fun drive(){
        println("Wroom!")
    }
}
fun main(){
    val c1 = Car( "Ford", "Mustang", 1969)
    val c2 = Car("BMW", "X5", 1999)
    val c3 = Car("Tesla", "Model S", 2020)
    
    
    
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)   
    println(c1.model)
    println(c1.year)

    println(c2.brand)
    println(c2.model)
    println(c2.year)

    println(c3.brand)
    println(c3.model)
    println(c3.year)
}


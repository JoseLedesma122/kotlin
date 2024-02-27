fun main() {
    var sales: IntArray? = null
    do {
        println("Enter today's sales for five stores")
        sales = IntArray(5) {
            print("Store ${it + 1}: ")
            readLine()!!.toIntOrNull()!!
        }
    } while (sales == null || sales.any { it == null })

    println("\nSALES BAR CHART")
    println("(Each * = $100)")
    for (i in sales.indices) {
        println("Store ${i + 1}: ${"*".repeat(sales[i] / 100)}")
    }
}
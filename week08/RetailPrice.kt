fun main() {
    print("Enter the item's wholesale cost: ")
    val wholesaleCost = readLine()!!.toDouble()

    print("Enter the item's markup percentage: ")
    val markupPercentage = readLine()!!.toDouble()

    val retailPrice = wholesaleCost * (1 + markupPercentage / 100)
    println("The item's retail price is: $${retailPrice}")
}
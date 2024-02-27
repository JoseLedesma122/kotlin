fun main() {
    var userInput: Int? = null
    while (userInput == null) {
        print("Enter a positive integer: ")
        val input = readLine()
        try {
            userInput = input?.toInt()
            if (userInput != null && userInput < 1) {
                println("Invalid input. Please enter a positive integer.")
                userInput = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    var total = 0
    for (i in 1..userInput) {
        total += i
    }

    println("The sum of all the integers between 1 and $userInput is $total")
}
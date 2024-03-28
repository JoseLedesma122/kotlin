fun main() {

    print("Enter the movie rating (G, PG, PG-13, R): ")
    val rating = readLine()
    print("Enter your age: ")
    val age = readLine()!!.toInt()

    if (rating == "G" && age >= 5) {
        println("You can watch the movie.")
    } else if (rating == "PG" && age > 8) {
        println("You can watch the movie.")
    } else if (rating == "PG-13" && age > 13) {
        println("You can watch the movie.")
    } else if (rating == "R" && age > 17) {
        println("You can watch the movie.")
    } else {
        println("You are not allowed to watch the movie.")
    }
}
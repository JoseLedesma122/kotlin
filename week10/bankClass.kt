class BankAccount(val accountNumber: String, val balance: Double, val ownerName: String)

fun main() {
    val cp1 = BankAccount("5045508", 1000.99, "Jose Ledesma" )


    println(cp1.accountNumber)
    println(cp1.balance)
    println("${cp1.ownerName}")


}
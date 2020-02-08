fun main() {
    val a = 100
    val b = 200

    var maximum: Int? = null

    // Traditional If condition
    println("Checking a > b traditionally")
    if (a > b) {
        println("a > b")
        maximum = a
    } else {
        println("a < b")
        maximum = b
    }
    println("Maximum = $maximum")


    // If in Kotlin can return value
    println("Checking a > b with if return")
    maximum = if (a > b) {
        println("a > b")
        a // Will be assigned to maximum
    } else {
        println("a < b")
        b // Will be assigned to maximum
    }
    println("Maximum = $maximum")

    // As an expression
    println("Checking the expression")
    maximum = if (a > b) a else b
    println("Maximum = $maximum")

}


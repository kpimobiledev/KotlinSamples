fun main() {
    val ints = intArrayOf(1, 2, 3, 4, 5)

    // While loop
    println("While loop")
    var lastIndex = ints.size
    while (lastIndex != 0) {
        lastIndex--
        println(ints[lastIndex])
    }

    // Do-While loop
    println("Do-while loop")
    do {
        println(ints[lastIndex])
        lastIndex++
    } while (lastIndex < ints.size)
}


fun main() {
    val ints = intArrayOf(1, 2, 3, 4, 5)

    // For loop
    println("For-in loop")
    for (element in ints) {
        println(element)
    }

    // For loop with indices
    println("For-in loop with indices")
    for (index in ints.indices) {
        println(ints[index])
    }

    // For loop using range
    println("For-in loop with range")
    for (index in 0 until ints.size) {
        println(ints[index])
    }

    // For loop using range (other way)
    println("For-in loop with range x2")
    for (index in 0..ints.size - 1) {
        println(ints[index])
    }

    // For loop with range and step
    println("For-in loop with steps and range")
    for (index in 10 downTo 0 step 2) {
        println(index)
    }

    // For loop with pair of index-value
    println("For-in loop with index-value pair")
    for ((index, value) in ints.withIndex()) {
        println("Value at $index is $value")
    }
}


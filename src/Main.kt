fun main() {
    val namesList = arrayListOf("Alice", "Bob", "Caroline", "Daniel", "Ewan")

    // Slicing a collection to receive a smaller collection
    println(namesList.slice(1..4))
    println(namesList.slice(0 until namesList.size step 2))
    println(namesList.slice(setOf(1, 2, 3)))

    // Getting part of collection by taking and dropping first/last values from it
    println(namesList.take(2))
    println(namesList.takeLast(4))
    println(namesList.drop(1))
    println(namesList.dropLast(3))

    // Getting part of collection by taking and dropping first/last values
    // from it while the condition is met
    println(namesList.takeWhile { it.length < 6 })
    println(namesList.takeLastWhile { it.toUpperCase() == it })
    println(namesList.dropWhile { it.endsWith('e') })
    println(namesList.dropLastWhile { it.startsWith('K') })

    // Collection chunks: create a collection of smaller collections of predefined chunk size
    val chunkedNames = namesList.chunked(2)
    println(chunkedNames)

    // Chunks with transformation made on the each chunk
    println(namesList.chunked(3) { it.joinToString(" and ") })

    // Windowing: creation of all the possible ranges of the predefined size
    println(namesList.windowed(3))
    println(namesList.windowed(1, step = 2))

    // Windowing with transformation made on each window
    println(namesList.windowed(3) { it.joinToString(" and ")})
}
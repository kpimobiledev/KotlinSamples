fun main() {
    val namesList = arrayListOf("Alice", "Bob")
    val optionalNamesSet = mutableSetOf("Alice", null, "Bob", null)

    // Adding element to a list
    namesList += "Carl"
    println(namesList.joinToString())

    // Extracting element from a list and assigning a result to another variable
    val otherNamesList = namesList - "Alice"
    println(otherNamesList.joinToString())

    // Removing elements list from set. Removing null removes all nulls
    optionalNamesSet -= listOf("Bob", null)
    println(optionalNamesSet.size == 1)
    println(optionalNamesSet.joinToString())
}
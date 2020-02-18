fun main() {

    val namesList = arrayListOf("Alice", "Bob")
    val optionalNamesSet = setOf("Alice", null, "Bob")
    val gradesMap = mapOf("Alice" to 100, "Bob" to 95)

    val anyList = listOf(1, 'a', "Alice")

    // Filtering examples with predicates
    namesList.filter { it.contains("i") }.forEach { println(it) }
    gradesMap.filter { (key, value) -> key.contains('A') && value > 90 }

    // Filtering with index
    namesList.filterIndexed { index, value -> index % 2 == 0 && value.contains('A') }

    // Filtering optional collection
    optionalNamesSet.filter { return@filter if (it == null) false else it.length > 5 }

    // Filtering by not matching the predicate
    namesList.filterNot { it == it.toUpperCase() }

    // Filtering an optional collection to receive non-null values
    optionalNamesSet.filterNotNull()

    // Filtering Any collection to receive only String values
    anyList.filterIsInstance<String>()

    // Partitioning: splitting the collection to two collections by predicate
    val (shortNamesList, longNamesList) = namesList.partition { it.length > 5 }

    // Filtering checks: any, none, all
    println(namesList.any { it.startsWith('A') })
    println(namesList.none { it.length > 10 })
    println(namesList.all { it.toUpperCase() != it })

    val emptyList = emptyList<String>()

    // Checking if the collection has any items
    println(emptyList.any())

    // Checking if the collection has no items
    println(emptyList.none())
}
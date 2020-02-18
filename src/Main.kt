fun main() {
    val namesList = arrayListOf("Alice", "Bob", "Caroline")
    val optionalNamesSet = setOf("Alice", "Bob", null)
    val gradesMap = mutableMapOf("Alice" to 100, "Bob" to 95)

    // Getting element by position in the indexed collections
    val name = namesList.get(1)
    val sameName = namesList[1]
    val aliceGrade = gradesMap.get("Alice")
    val sameAliceGrade = gradesMap["Alice"]

    // Getting element by position in non-indexed collection
    val optionalName = optionalNamesSet.elementAt(1)

    // These conditional methods can return value even if the index is out of bounds
    optionalNamesSet.elementAtOrElse(3) { "Daniel" }
    optionalNamesSet.elementAtOrNull(4)

    // Getting first and last elements by position
    optionalNamesSet.first()
    namesList.last()

    // Getting first element matching the condition
    optionalNamesSet.first { it != null && it.contains('o') }

    // Getting last element matching the condition
    namesList.last { it.length > 3 }

    // Also these methods have nullable variations in case there's no match
    // firstOrNull() is the same as find()
    namesList.firstOrNull { !it.contains('b') }
    namesList.find { !it.contains('b') }

    // lastOrNull() is the same as findLast()
    namesList.lastOrNull { it.toUpperCase() != it }
    namesList.findLast { it.toUpperCase() != it }

    // Getting random element from the collection
    println(namesList.random())

    // Checking if element is in the collection
    val element = "Caroline"
    println(element in namesList)
    println(namesList.contains(element))

    // Checking if a collection contains another collection elements
    println(namesList.containsAll(listOf("Alice", "Daniel")))

    // Checking emptiness of the collection
    println(namesList.isEmpty())
    println(namesList.isNotEmpty())


}
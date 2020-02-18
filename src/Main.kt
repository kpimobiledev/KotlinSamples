fun main() {

    // Mapping: transformation of one collection to another by transforming collection values

    val namesList = arrayListOf("Alice", "Bob")
    val optionalNamesSet = setOf("Alice", null, "Bob")
    val gradesMap = mapOf("Alice" to 100, "Bob" to 95)

    // Converting to a list of element lengths
    val lengthsList = namesList.map { it.length }

    // Converting to a list of index-value pairs and then to map
    val indexedNamesMap = namesList.mapIndexed { index, s -> index to s }.toMap()

    // Mapping optional collections
    val lengthsSet = optionalNamesSet.mapNotNull { it?.length }
    val nameLengthMap = optionalNamesSet.mapIndexedNotNull { index, s -> index to s?.length }.toMap()

    // Converting to a list of index-value pairs and then to map
    val examGradesMap = gradesMap.map { it.key to it.value * 0.6f }.toMap()

    // Transforming map to list
    val valuesList = gradesMap.map { it.value }

    // Transforming keys to the mapped values
    val mappedKeysMap = gradesMap.mapKeys { "${it.key} ${it.value}" }

    // Transforming values to the mapped values
    val mappedValuesMap = gradesMap.mapValues { "${it.key} ${it.value}" }

    // Zipping: transformation of mapping two collections values by index

    val firstWords = listOf("Roses", "Violets")
    val secondWords = listOf("Red", "Blue")

    firstWords.zip(secondWords).forEach { println("${it.first} are ${it.second}") }

    val somePairsList = listOf("Alice" to 100, "Bob" to 95)
    val (names, grades) = somePairsList.unzip()

    // Association: building maps from collections

    // Creation of map with names as keys and lengths as values
    val lengthValuesMap = namesList.associateWith { it.length }

    // Creation of map with names as values and length as keys
    val lengthKeysMap = namesList.associateBy { it.length }

    // Association with both values and keys changing
    val namesAssociatedMap = namesList.associate { it.toUpperCase() to it.length }

    // Flattening: creation of one-level collection from the elements which are collections
    val collectionOfCollections = listOf(setOf(1, 2, 3), listOf(4, 5, 6))
    val collectionsMap = mapOf("Alice" to listOf("Singing", "Dancing"), "Bob" to listOf("Playing drums"))

    // Flattening the collection of collections to a one-level collection
    collectionOfCollections.flatten().forEach { println(it) }

    // Using flatMap to flatten the collections
    collectionOfCollections.flatMap { it.toList() }.forEach { println(it) }
    collectionsMap.flatMap { it.value }.forEach { println(it) }

    // String joining: transformation of the collection elements to String

    // Joining list elements to String using default settings and customized settings
    println(namesList.joinToString())
    println(optionalNamesSet.joinToString(separator = " * ", prefix = "!!! ", postfix = "%%%"))

    // Joining list elements to StringBuffer
    val namesBuffer = StringBuffer("Names: ")
    println(namesList.joinTo(namesBuffer))
}
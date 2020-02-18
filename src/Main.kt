fun main() {
    val namesList = arrayListOf("Michael", "Jim", "Pamela", "Dwight", "Angela")
    val numbersList = arrayListOf(1.0, 2.0, 10.0, 4.0, 5.0, 42.0, 100.0, 0.0, 0.1, 0.3)

    // Strings and chars are sorted in lexicographical order
    println(namesList.sorted())
    println(namesList.sortedDescending())

    // Numbers are sorted by numeric order
    println(numbersList.sorted())
    println(numbersList.sortedDescending())

    // Sorting the list of comparable items
    val personList = listOf(Person("Alice", 25), Person("Bob", 18))
    println(personList.sorted())
    println(personList.sortedDescending())

    // Using custom comparator to sort a collection
    val strangeComparator = Comparator<Double> { first, second ->
        (first * first - first).compareTo(second * second - second)
    }
    println(numbersList.sortedWith(strangeComparator))

    // Custom order sorting
    println(personList.sortedBy { it.name })
    println(personList.sortedByDescending { it.name })

    // Reverse collection
    println(namesList.reversed()) // New collection
    println(namesList.asReversed()) // Different view of the same collection

    // Randomly-ordered collection
    println(namesList.shuffled())
}

data class Person(val name: String, private val age: Int) : Comparable<Person> {
    override fun compareTo(other: Person) = age.compareTo(other.age)
}
fun main() {
    // Creating data class instance
    val person = Person("John", 20)
    // Copying data class
    val otherPerson = person.copy(name = "Jane")

    // Referring data class params
    println(person.name)
    println(person.component1()) // Same as name

    // Data classes can be decomposed like this
    val (name, age) = person
    val (_, otherPersonAge) = otherPerson // In case you don't need the name

    // Decomposition in arrays processing
    val array = arrayOf(person, otherPerson)
    for ((currentName, currentAge) in array) {
        println(currentName)
        println(currentAge)
    }

}

// Simple data class
// Kotlin makes equals(), hashCode(), copy(), toString() and componentN() – in this case 1 and 2
data class Person(val name: String, var age: Int) {
    // There can be body parameters, but they won't participate in decomposition
    var someOptionalField: Int? = null
}


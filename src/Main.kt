import java.lang.StringBuilder

fun main() {
    val countries = listOf("Ukraine", "USA", "Australia", "Austria", "Switzerland")

    // Group list items by first letter
    val alphabetCountryMap = countries.groupBy { it.first() }.forEach { println(it.key) }

    // Grouping by: grouping that supports functions on groups

    // Creation of map of Letter / countries count per letter
    countries.groupingBy { it.first() }.eachCount().forEach { (t, u) -> println("$t, $u") }

    // Creates a map of Char to String, String is composed by fold() function
    countries
        .groupingBy { it.first() }
        .fold("by default") { accumulator, element -> "$accumulator, $element" }
        .forEach { (t, u) -> println("$t, $u") }

    // Creates a map of Char to String, String is composed by reduce() function
    countries
        .groupingBy { it.first() }
        .reduce { _, acc, element -> "$acc, $element" }
        .forEach { (t, u) -> println("$t, $u") }

    // Creates a map of Char to aggregated String composed by aggregate() function
    countries
        .groupingBy { it.first() }
        .aggregate { key, accumulator: StringBuilder?, element, first ->
            return@aggregate if (first) StringBuilder("By $key we have $element")
            else accumulator!!.append(", $element")
        }
        .forEach { (t, u) -> println("$t, $u") }
}
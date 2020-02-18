import kotlin.math.pow

fun main() {
    val numbers = arrayListOf(1.0, 2.0, 3.0, 4.0, 5.0)

    // Simple aggregate operations
    println("Count: ${numbers.count()}")
    println("Max: ${numbers.max()}")
    println("Min: ${numbers.min()}")
    println("Average: ${numbers.average()}")
    println("Sum: ${numbers.sum()}")

    // Finding max and min values using condition
    println(numbers.maxBy { it.pow(0.6) })
    println(numbers.minBy { it.pow(3) - it.pow(2) })

    // Using comparator
    val strangeComparator = Comparator<Double> { first, second ->
        (first.pow(0.3) - first).compareTo(second.pow(0.2) + second)
    }
    println(numbers.maxWith(strangeComparator))
    println(numbers.minWith(strangeComparator))

    // Sum with condition
    println(listOf(1, 2, 3).sumBy { it * 5 })
    println(numbers.sumByDouble { it * 3 })

    // Reducing: accumulation of value starting with first argument. So here the first element isn't doubled
    val reducedSum = numbers.reduce { sum, element -> sum + element * 2 }
    println(reducedSum)

    // Folding: accumulation of value starting with initial value. So here the first element is doubled
    val foldSum = numbers.fold(0.0) { sum, element -> sum + element * 2 }
    println(foldSum)

    // Folding and reducing right: from last to previous
    println(numbers.reduceRight { element, initial ->
        return@reduceRight initial - element * 2
    })
    println(numbers.foldRight(100.0) { element, initial -> initial - element * 2 })

    // Folding and reducing with indices
    println(numbers.reduceIndexed { index, acc, current -> if (index % 2 == 0) acc + current else acc })
    println(numbers.foldIndexed(0.0) { index, acc, current -> if (index % 2 != 0) acc + current else acc })

}

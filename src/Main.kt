import java.util.*

fun main() {
    val enlistedArray = arrayOf(1, 2, 3, 4) // Enlisted array of Ints
    val anyArray = arrayOf(1, 'a', true) // Enlisted array of Any
    val lambdaArray = Array(10) { it -> it * 2 } // Defining array by lambda
    val datesArray = arrayOf(Date()) // Arrays of Dates

    // Some actions with arrays
    enlistedArray[1] = 5 // Setting value at index
    println("Element at index 1 is ${enlistedArray[1]}") // Getting value at index
    println("Size of enlistedArray is ${enlistedArray.size}")

    // High-order functions with arrays
    println("Members of anyArray:")
    anyArray.forEach { println(it) }

    println("Filtered trues")
    anyArray.filter { it is Boolean && it == true }.forEach { println(it) }

    // Primitive type arrays
    val intArray = intArrayOf(1, 2, 3)
    val shortArray = shortArrayOf(1, 2, 3)
    val byteArray = byteArrayOf(1, 2, 3)
    val longArray = longArrayOf(1L, 2L, 3L)
    val floatArray = floatArrayOf(1f, 2f, 3f)
    val doubleArray = doubleArrayOf(1.0, 2.0, 3.0)

    val lambdaIntArray = IntArray(100) { it -> it - 1 } // defining with lambda
    val answersArray = IntArray(42) { 42 } // 42 cells with value = 42

    // Actions with primitive type arrays
    println("Actions with primitive type arrays:")
    intArray[1] = 5 // Setting value
    println("Element at index 1 is ${intArray[1]}") // Getting value at index
    println("Size: ${intArray.size}")
    intArray.forEach { println(it * 2) } // High-order functions


    // Confusing difference
    val sampleIntArray = intArrayOf(100, 200, 300)
    val sampleArray = arrayOf(100, 200, 300)

    println("Confusing difference")
    println("Arrays are equal: ${sampleArray.toIntArray() == sampleIntArray}") // Try to remove toIntArray()
    println("Content is equal: ${sampleArray.contentEquals(sampleIntArray.toTypedArray())}") // Try to remove toTypedArray()

    // Try uncommenting these:
    // println("Is SampleIntArray an Array<Int>: ${sampleIntArray is Array<Int>}")
    // println("Is SampleArray an IntArray: ${sampleArray is IntArray}")




}


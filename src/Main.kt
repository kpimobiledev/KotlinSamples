fun main() {
    // Defining a final Int value
    val one = 1
    val anotherOne: Int = 1

    // Defining an Int variable
    var intNumber = 2
    intNumber = 3

    // Also Int
    val hexInt = 0xFE
    val binaryInt = 0b1010

    // Long
    val longNumber = 1234567890
    val anotherLongNumber = 1L
    val creditCardNumber = 1234_5678_9012_3456L

    // Byte
    val oneByte: Byte = 1

    // Double
    val pi = 3.14
    val e = 2.7182818284
    val definedWithE = 123.45e10

    // Float
    val eFloat = 2.7182818284f

    // Value comparison: identity vs equality
    val a = 12345
    val firstOptionalA: Int? = a
    val secondOptionalA: Int? = a

    println("Identity vs equality")
    println("first is identical to second: ${firstOptionalA === secondOptionalA}") // Prints false
    println("first is equal to second: ${firstOptionalA == secondOptionalA}") // Prints true

    // Explicit type conversion
    var longTen = 10L
    val intTen = 10

    println("Explicit type conversion")
    println("Long equal to Int: ${longTen.toInt() == intTen}") // Try removing "toInt()"

    longTen = intTen.toLong() // Same about assigning "smaller" type value to "larger"
    println("Long after assignment: $longTen")

    // Bitwise arithmetical operations
    val shiftLeft = 1 shl 2
    val shiftRight = 1 shr 2
    val unsignedShiftRight = 1 ushr 2
    val bitwiseAnd = 1 and 2
    val bitwiseOr = 1 or 2
    val bitwiseXOR = 1 xor 2
    val bitwiseInversion = 1.inv()

    // Number comparison
    val firstNumber = 1
    val secondNumber = 2

    println("Number comparison")
    println("$firstNumber > $secondNumber : ${firstNumber > secondNumber}")
    println("$firstNumber <= $secondNumber : ${firstNumber <= secondNumber}")
    println("$firstNumber == $secondNumber : ${firstNumber == secondNumber}")
    println("$firstNumber != $secondNumber : ${firstNumber != secondNumber}")
    println("$firstNumber in range of 0..10 : ${firstNumber in 0..10}")
    println("$secondNumber not in range of 0..10 : ${secondNumber !in 0..10}")
}


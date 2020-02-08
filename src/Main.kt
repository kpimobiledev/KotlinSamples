import java.util.*

fun main() {
    val a = 10
    val b = 20

    // Calling sum function
    println("Sum of $a and $b is ${sum(a, b)}")

    // Calling printGreetings() function
    printGreetings("Mario")

    // Calling defaultGreetings() function with different parameters order
    defaultGreetings()
    defaultGreetings("Jane", 22)
    defaultGreetings("Somebody")
    defaultGreetings(age = randomAge())
    defaultGreetings(age = randomAgeSugared(), name = "Jane") // Named parameters allow to change order

    // Calling processGreetings differently
    processGreetings(name = "Jane", age = 22, process = { greeting -> println(greeting) })
    processGreetings("Joe", 22, { greeting -> println(greeting) })
    processGreetings("John", 22) { greeting -> println(greeting) }

    // Storing lambda as a parameter
    val greetingProcessor = { greeting: String ->
        println("Here's the greeting $greeting")
    }
    processGreetings("Joe", 22, greetingProcessor)

    // Using returned functional type
    arrayOf(1, 2, 3, 4, 5).filter(makeDummyFilter(4))

    // Calling vararg function
    greetEverybody("John", "Jane")

    // Using extension function
    println("4 is even: ${4.isEven()}")

    // Using infix function
    println("4 + 5 = ${4 customAdd 5}")

    // Calling inspectString() function looking if it has a 'e' symbol in it
    println("Inspect string: ${inspectString("Some string", 'e')}")

    // Calling recursive function
    println("Launching a rocket!")
    countToLaunch(5)

    // Anonymous function assigned to a variable
    val anonymousLength = fun(s: String): Int {
        return s.length
    }

    anonymousLength("My string")
}

// Sample of function that takes arguments and returns a result
fun sum(first: Int, second: Int): Int {
    return first + second
}

// Sample of function that takes arguments and doesn't return a result
fun printGreetings(name: String): Unit = println("Hello, it's me, $name!")

// Absolutely the same as above
fun printGreetingsNoUnit(name: String) = println("Hello, it's me, $name!")

// Sample of function that doesn't take arguments and returns a result
fun randomAge(): Int {
    return Random().nextInt(100)
}

// Single-line representation
fun randomAgeSugared() = Random().nextInt(100)

// Function with default arguments
fun defaultGreetings(
    name: String = "Mario",
    age: Int = 42
) = println("Hello, I'm $name! I'm $age years old")

// Function accepting lambda as an argument
fun processGreetings(
    name: String,
    age: Int,
    process: (String) -> Unit
) = "I'm $name, I'm $age years old".apply(process)

// Function returning functional type value
fun makeDummyFilter(value: Int): (Int) -> Boolean {
    return { current: Int -> current == value }
}

// Function accepting variable amount of arguments
fun greetEverybody(vararg names: String) {
    names.forEach { println("Hello $it") }
}

// Extension function
fun Int.isEven() = this % 2 == 0

// Infix function: allows syntax 4 customAdd 5
infix fun Int.customAdd(other: Int) = this + other

// Function with a nested function
fun inspectString(s: String, char: Char): Boolean {
    // as the inspectChar() is nested in inspectString(), it sees the inspectString() function context
    fun inspectChar(current: Char): Boolean {
        return@inspectChar current == char
    }

    var result = false
    for (element in s) {
        result = result || inspectChar(element)
    }

    return result
}

// Function with recursion
tailrec fun countToLaunch(current: Int) {
    println("$current!")
    if (current > 1) countToLaunch(current - 1)
}
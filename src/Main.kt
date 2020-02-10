fun main() {
    // Object expression implementing an interface
    val myPrintable = object : Printable {
        override fun print() {
            println("I can be printed")
        }
    }

    // Object expression inheriting a class
    val myAnimation = object : Animation() {
        override fun animate() {
            println("Animation running")
        }
    }

    // Using object declaration
    println(SingletonObject.someValue)
    SingletonObject.someMethod()

    // Using a function with an object expression
    doSomething()

    // Using an object returned by a private function
    val generatedObject = generateObject("John", 20)
    println(generatedObject.personName)

    // Calling method of the companion class
    SomeClass.printPI()
    SomeClass.Companion.printPI()

}

// Dummy interface
interface Printable {
    fun print()
}

// Dummy open class
open class Animation {
    open fun animate() {}
}

// Object declaration
object SingletonObject {
    var someValue: String? = "Value"

    fun someMethod() {
        println("Hello from Singleton")
    }
}

fun doSomething() {
    // Object can be created as a variable
    val address = object {
        var city = "Kyiv"
        val country = "Ukraine"
    }

    println("${address.city}, ${address.country}")
}

// Object can be returned by private function
private fun generateObject(name: String, age: Int) = object {
    val personName = name
    val personAge = age
}

// Companion object example
class SomeClass {
    companion object {
        const val PI = 3.14 // Static value

        fun printPI() = println(PI) // Static method
    }
}

fun main() {
    val inner = Outer().Inner()
    inner.innerMethod()

    val nested = Outer.Nested()
    nested.nestedMethod()
}

// Simple outer class with a few fields and methods
class Outer {
    private val outerVal = 100
    var outerVar = "Hello"

    fun outerMethod() { println("Do something") }

    private fun otherOuterMethod() { println("Do something secretive") }

    inner class Inner {
        fun innerMethod() {
            println(outerVal)
            println(outerVar)
            outerMethod()
            otherOuterMethod()
        }
    }

    class Nested {
        fun nestedMethod() {
            // Try to uncomment it
            // println(outerVal)
            // println(outerVar)
            // outerMethod()
            // otherOuterMethod()
        }
    }
}
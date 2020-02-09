import kotlin.math.abs

// Class Person by default inherits Any
class Sample

// Explicitly it looks like this:
class SameSample : Any()

// Class Figure available for inheritance
open class Figure // Try to remove "open"

// Derived class
open class Rectangle(val a: Int, val b: Int) : Figure()

// Derived class with arguments passed to parent constructor
class Square(val sideLength: Int) : Rectangle(sideLength, sideLength)

// Base class with open fields and methods
open class Animation {
    var durationMillis: Long? = null // Can't override this
    open val animationName = "Basic Animation" // Can override this
    open var delayMillis = 5000L // Can override this

    // Can't override this
    fun nameAnimation() {
        println(animationName)
    }

    // Can override this
    open fun animate() {
        println("Running animation")
    }
}

// Derived class which can be the base class itself
open class TransitionAnimation(
    val startX: Double,
    val endX: Double
) : Animation() {
    // Can't override this anymore in derived classes
    final override val animationName = "Transition"

    // Can override this in future derived classes
    override var delayMillis = abs(endX - startX).toLong() * 1000L // Some weird calculation

    // This method calls its base class method
    override fun animate() {
        super.animate()
        println("Animating transition from $startX to $endX")
    }
}

open class Transition2DAnimation(
    startX: Double,
    endX: Double,
    val startY: Double,
    val endY: Double
) : TransitionAnimation(startX, endX) {

    // Using base class field for initialization
    override var delayMillis = super.delayMillis / 2

    // Can't override this method anymore in the derived classes
    final override fun animate() {
        println("Animating transition from ($startX; $startY) to ($endX; $endY)")
    }
}

// Base class with an open method
open class Text {
    open fun read() {
        println("I'm reading")
    }
}

// Interface with the same-named method
interface Readable {
    fun read() {
        println("Default read implementation")
    }
}

// Derived class inheriting base class and implementing an interface
class Book : Text(), Readable {
    override fun read() {
        super<Readable>.read()
        super<Text>.read()
    }
}

// Abstract class
abstract class Drawable {

    // Abstract class can have its own methods
    fun printInfo() {
        println("Info")
    }

    // Derived class can override this method
    open fun defineDrawingParameters(vararg parameters: String) {
        parameters.forEach { println(it) }
    }

    // Derived class must implement this method if derived is not abstract too
    abstract fun draw()
}

// Derived class implementing abstract method
class Shape : Drawable() {

    override fun draw() {
        println("Drawing shape")
    }

}

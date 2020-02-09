// Simple interface
interface Readable {
    fun read()
    fun readWithBody() {
        println("I'm the default body of read method")
    }
}

// Class implementing an interface. The interface method with body is not obligatory for overriding
class Book : Readable {
    override fun read() {
        println("I read a book")
    }
}

// Interface with properties defined
interface Animation {
    var startValue: Double // Abstract variable property
    val duration: Long // Abstract final property

    val delay: Long
        get() = 1000L // Final values can have default implementations

    fun animate()
}

// Interface implementation: no need for value with default implementation
class ScaleAnimation : Animation {
    override var startValue = 0.0
    override val duration = 5000L

    override fun animate() {
        println("Scaling animation")
    }
}

// Interface with 2 methods with default implementations
interface Buyable {
    fun getPrice() = 100
    fun getName() = "Chocolate"
}

// Another interface with 2 methods with default implementations
interface Storable {
    fun getName() = "Chips"
    fun getPrice() = 400
}

// Class implementing both interfaces and referring to the base implementations
class Item : Buyable, Storable {
    override fun getPrice(): Int {
        return super<Buyable>.getPrice()
    }

    override fun getName(): String {
        return super<Storable>.getName()
    }
}

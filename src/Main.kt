fun main() {
    // Creating objects implementing interfaces
    val readable = object : Readable {
        override fun read() {
            println("I can read")
        }
    }
    readable.read()
    readable.readWithBody()

    val book = Book()
    book.read()
    book.readWithBody()

    // Creating objects implementing interfaces with properties
    val animation = object : Animation {
        override var startValue = 0.0
        override val duration = 1000L

        override fun animate() {
            println("Doing magnificent animation")
        }
    }
    println(animation.delay) // Can refer to the interface default property
    animation.animate()

    val scaleAnimation = ScaleAnimation()
    println(scaleAnimation.delay) // Can refer to the interface default property
    scaleAnimation.animate()

    // Conflict of interfaces
    val buyable = object : Buyable {}
    println("${buyable.getName()} can be bought by ${buyable.getPrice()}")

    val storable = object : Storable {}
    println("${storable.getName()} is a stored item by ${storable.getPrice()}")

    val item = Item()
    println("${item.getName()} is a stored item by ${item.getPrice()}")

}
fun main() {
    // Creating some objects of the classes with inheritance
    val sample = Sample()
    val figure = Figure()
    val rectangle = Rectangle(4, 5)
    val square = Square(4)

    // Simple object creation and method calling
    val animation = Animation()
    println(animation.animationName)
    println(animation.delayMillis)
    animation.animate()

    val transitionAnimation = TransitionAnimation(10.0, 20.0)
    println(transitionAnimation.animationName)
    println(transitionAnimation.delayMillis)
    transitionAnimation.animate()

    val transition2DAnimation = Transition2DAnimation(10.0, 10.0, 20.0, 20.0)
    println(transition2DAnimation.animationName)
    println(transition2DAnimation.delayMillis)
    transition2DAnimation.animate()

    // Creating an object inheriting the Animation class
    val customAnimation = object : Animation() {
        override val animationName = "Custom Animation"
        override var delayMillis = 1000L

        override fun animate() {
            super.animate()
            println("My own animate")
        }
    }
    customAnimation.animate()


    val customTransition = object : TransitionAnimation(10.0, 20.0) {
        // Try to uncomment this line
        // override val animationName = "Custom Transition"

        override var delayMillis = 1000L

        override fun animate() {
            super.animate()
            println("My own transition")
        }
    }
    customTransition.animate()

    val custom2DTransition = object : Transition2DAnimation(
        10.0, 20.0, 10.0, 20.0
    ) {
        // Try to uncomment this line
        // override val animationName = "Custom Transition"

        override var delayMillis = 1000L

        // Try to uncomment
        //override fun animate() {
        //    super.animate()
        //    println("My own 2D transition")
        //}
    }
    custom2DTransition.animate()

    // Checking how same-named method inheritance/implementation works
    val text = Text() // Creating base class instance
    text.read()

    val readable = object : Readable {} // Creating instance implementing interface
    readable.read()

    val book = Book()
    book.read()

    // Abstract class instance creation
    val drawable = object : Drawable() {
        override fun draw() {
            println("I'm drawing something")
        }
    }
    drawable.draw()

    val shape = Shape()
    shape.draw()

}
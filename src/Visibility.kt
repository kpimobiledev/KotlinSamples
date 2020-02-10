// Class visible everywhere
class PublicClass {
    val publicValue = 100 // Value visible everywhere
    private val privateValue = 200 // Value visible only inside class
    internal val internalValue = 300 // Value visible in the module
}

// Class visible in the module
internal class InternalClass {
    val publicValue = 100 // Value visible in the module
    private val privateValue = 200 // Value visible only inside class
    internal val internalValue = 300 // Value visible in the module
}

// Class visible in the file
private class PrivateClass {
    val publicValue = 100 // Value visible in the file
    private val privateValue = 200 // Value visible only inside class
    internal val internalValue = 300 // Value visible in the file
}

val globalPublicValue = 400 // Value visible everywhere
internal val globalInternalValue = 500 // Value visible in the module
private val globalPrivateValue = 600 // Value visible in the file

// Function visible everywhere
fun globalPublicFunction() { println("I'm global public function") }

// Function visible in the module
internal fun globalInternalFunction() { println("I'm global internal function") }

// Function visible in the file
private fun globalPrivateFunction() { println("I'm global private function") }

class Outer {

    // Visible only inside Outer
    private inner class InnerPrivate {
        fun foo() { println("Bar") }
    }

    // Visible inside module
    internal inner class InnerInternal {
        fun foo() { println("Bar") }
    }

    // Visible everywhere
    inner class InnerPublic {
        fun foo() { println("Bar") }
    }

    // Visible only inside Outer
    private class NestedPrivate {
        fun foo() { println("Bar") }
    }

    // Visible inside module
    internal class NestedInternal {
        fun foo() { println("Bar") }
    }

    // Visible everywhere
    class NestedPublic {
        fun foo() { println("Bar") }
    }
}

// Class in the same file
class SameFileSample {
    fun usePublicClass() {
        val instance = PublicClass()
        println(instance.publicValue)
        println(instance.internalValue)
    }

    fun useInternalClass() {
        val instance = InternalClass()
        println(instance.publicValue)
        println(instance.internalValue)
    }

    fun usePrivateClass() {
        val instance = PrivateClass()
        println(instance.publicValue)
        println(instance.internalValue)
    }

    fun useValuesAndFunctions() {
        println(globalPublicValue)
        println(globalInternalValue)
        println(globalPrivateValue)

        globalPublicFunction()
        globalInternalFunction()
        globalPrivateFunction()
    }

    fun checkNestedAndInnerClasses() {
        // Try to uncomment
        // val innerPrivate = Outer().InnerPrivate()

        val innerInternal = Outer().InnerInternal()
        innerInternal.foo()
        val innerPublic = Outer().InnerPublic()
        innerPublic.foo()

        // Try to uncomment
        // val nestedPrivate = Outer.NestedPrivate()

        val nestedInternal = Outer.NestedInternal()
        nestedInternal.foo()
        val nestedPublic = Outer.NestedPublic()
        nestedPublic.foo()
    }
}
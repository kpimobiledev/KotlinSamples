// A class in the same package
class SamePackageSample {

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
        // Try to uncomment it
//         val instance = PrivateClass()
    }

    fun useValuesAndFunctions() {
        println(globalPublicValue)
        println(globalInternalValue)

        // Try to uncomment
        // println(globalPrivateValue)

        globalPublicFunction()
        globalInternalFunction()

        // Try to uncomment
        // globalPrivateFunction()
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


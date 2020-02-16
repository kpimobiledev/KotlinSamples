import kotlin.random.Random

fun main() {
    val myOptional = Optional(5)

    // Try to change the Number in constructor invocation and method return to Int
    val dummyProducer: DummyProducer<Number> = object : DummyProducer<Number>() {
        override fun produceNext(): Number {
            return 42
        }
    }

    // Covariant types: Producer<Int> value can be Producer<Number> value due to "out"
    val producer: Producer<Number> = object : Producer<Int>() {
        override fun produceNext(): Int {
            return Random.nextInt()
        }
    }

    // Try to change the Int in constructor invocation and method argument to Number
    val dummyConsumer: DummyConsumer<Int> = object : DummyConsumer<Int>() {
        override fun consumeNext(t: Int) {
            println(t)
        }

    }

    // Contravariant types: Consumer<Number> value can be Consumer<Int> value due to "in"
    val consumer: Consumer<Int> = object : Consumer<Number>() {
        override fun consumeNext(t: Number) {
            println(t)
        }
    }

    // Two instances of custom collections
    val firstCollection = MyCollection<Int>()
    val secondCollection = MyCollection<Any>()

    // Try uncommenting this line
    // compareAny(firstCollection, secondCollection)

    // Calling a function using on-site type variance: all derived types are suitable for "out"
    addAll(firstCollection, secondCollection)

    // Calling a function using on-site variance: all super types are suitable for "in"
    addToCollection(secondCollection, 45)

    // Calling generic functions
    myFilter(arrayOf(1, 2, 3)) { it % 2 == 0 }

    "Dummy string".myPrint()
    4.myPrint()

    iterateNumbers(listOf(1, 2, 3))
}

// Simple class boxing generic value
class Optional<T>(t: T?) {
    var value = t
}

// This is a producer class that can produce T type values. Though you can't
// assign DummyProducer<Derived> value to DummyProducer<Base> variable
abstract class DummyProducer<T> {
    abstract fun produceNext(): T
}

// This is a producer class that supports type covariance: e.g. you can assign
// Producer<Derived> value to Producer<Base> variable.
// Bad news: Producer<T> can't consume values of type T
abstract class Producer<out T> {
    abstract fun produceNext(): T
}

// This is a consumer class that can consume T type values. Though you can't
// assign DummyConsumer<Derived> variable to DummyConsumer<Base> value
abstract class DummyConsumer<T> {
    abstract fun consumeNext(t: T)
}

// This is a consumer class that supports contravariant types: e.g. you can assign
// Consumer<Derived> value to Consumer<Base> variable.
// Bad news: Consumer<T> can't produce values of type T
abstract class Consumer<in T> {
    abstract fun consumeNext(t: T)
}

// Class that has consuming and producing methods but doesn't have
// any co- or contravariance options
class MyCollection<T> {
    private val list = ArrayList<T>()

    // Dummy consuming method
    fun add(element: T) {
        list.add(element)
    }

    // Dummy producing method
    fun get(index: Int): T {
        return list[index]
    }

    fun size() = list.size
}

// Function that takes two collections of Any and compares them.
// In case the collection has the generic type derived from Any, the function won't work with such collection
fun compareAny(first: MyCollection<Any>, second: MyCollection<Any>): Boolean {
    if (first.size() != second.size()) return false

    // Dummy comparison
    var result = true
    for (index in 0 until first.size()) result = result && (first.get(index) == second.get(index))
    return result
}

// Function that adds all items from the first collection to the second one
// Bad news: you can't call consuming methods on on-site "out" arguments
fun addAll(from: MyCollection<out Any>, to: MyCollection<Any>) {
    for (index in 0 until from.size()) to.add(from.get(index))
}

// Function that adds a value to collection. Collection can be super-type of Number
fun addToCollection(to: MyCollection<in Number>, value: Number) {
    to.add(value)
}

// Generic function consuming and producing parametrized type values
fun <T> myFilter(array: Array<T>, rule: (T) -> Boolean): Array<T> {
    // ...
    return array
}

// Generic extension function
fun <T> T.myPrint() {
    println(this.toString())
}

// Types in generics can be restricted
fun <T : Number> iterateNumbers(iterable: Iterable<T>) {
    // ...
}
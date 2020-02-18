fun main() {

    // Iterable is a parent interface of the Collection. It's also used in
    // ranges and custom iterable objects
    val iterable = Iterable {
        object : Iterator<Int> {
            override fun hasNext(): Boolean {
                return true
            }

            override fun next(): Int {
                return 42
            }
        }
    }

    // Iterable is a parent interface of the Collection. It's also used in
    // ranges and custom iterable objects
    val mutableIterable = object : MutableIterable<Int> {
        override fun iterator(): MutableIterator<Int> {
            return object : MutableIterator<Int> {
                override fun hasNext(): Boolean {
                    return true
                }

                override fun next(): Int {
                    return 42
                }

                override fun remove() {}
            }
        }
    }

    // Collection interface is used for collections in Kotlin (except Map)
    val collection = object : Collection<Int> {
        override val size: Int
            get() = 42

        override fun contains(element: Int): Boolean {
            return false
        }

        override fun containsAll(elements: Collection<Int>): Boolean {
            return true
        }

        override fun isEmpty(): Boolean {
            return size == 0
        }

        override fun iterator(): Iterator<Int> {
            return object : Iterator<Int> {
                override fun hasNext(): Boolean {
                    return false
                }

                override fun next(): Int {
                    return 42
                }
            }
        }
    }

    // MutableCollection interface is used for mutable collections in Kotlin (except Map)
    val mutableCollection = object : MutableCollection<Int> {
        override val size: Int
            get() = 42

        override fun contains(element: Int): Boolean {
            return false
        }

        override fun containsAll(elements: Collection<Int>): Boolean {
            return true
        }

        override fun isEmpty(): Boolean {
            return size == 0
        }

        override fun iterator(): MutableIterator<Int> {
            return object : MutableIterator<Int> {
                override fun hasNext(): Boolean {
                    return false
                }

                override fun next(): Int {
                    return 42
                }

                override fun remove() {}
            }
        }

        override fun add(element: Int): Boolean {
            return true
        }

        override fun addAll(elements: Collection<Int>): Boolean {
            return true
        }

        override fun clear() {}

        override fun remove(element: Int): Boolean {
            return false
        }

        override fun removeAll(elements: Collection<Int>): Boolean {
            return false
        }

        override fun retainAll(elements: Collection<Int>): Boolean {
            return true
        }
    }

    // Read-only Kotlin collections: List, Set, Map
    val list = listOf(1, 2, 3)
    val set = setOf('a', 'b', 'c')
    val map = mapOf(1 to "Alice", 2 to "Bob")

    // Some actions on read-only collections
    println(list[0])
    set.forEach { println(it) }
    map.filterKeys { it % 2 == 0 }.forEach { (key, value) -> println("$key : $value") }

    // Mutable Kotlin collections: MutableList, MutableSet, MutableMap
    val mutableList = mutableListOf(1, 2, 3)
    val mutableSet = mutableSetOf('a', 'b', 'c')
    val mutableMap = mutableMapOf(1 to "Alice", 2 to "Bob")

    // Some actions on mutable collections
    mutableList.add(5)
    mutableSet.remove('b')
    mutableMap[3] = "Carl"

    // Creation of collections constructed with elements
    val elementsList = listOf(1, 2, 3)
    val emptyList = emptyList<String>()
    val applyMap = mutableMapOf<String, Int>().apply { this["Alice"] = 5 }

    // Creation with lambda function
    val lambdaList = List(5) { it.toString() }

    // Creation with concrete type constructor
    val someSet = HashSet<Int>(5)
    val linkedHashMap = LinkedHashMap<String, String>(10)

    // Transforming collections
    val dummyTransformedCollection = someSet.toMutableSet().toMutableList()
    val squaredElementsMap = elementsList.associateWith { it * it }

}
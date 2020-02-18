fun main() {

    // Iterator usage
    val list = listOf(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    // Mutable iterator usage
    val mutableList = arrayListOf(1, 2, 3, 4, 5)
    val mutableIterator = mutableList.iterator()
    while (mutableIterator.hasNext()) {
        val current = mutableIterator.next()
        if (current % 2 == 0) mutableIterator.remove()
    }

    mutableList.forEach { println(it) }

    // Using list iterators: iterating in forward and backward directions
    val listIterator = list.listIterator()
    while (listIterator.hasNext()) {
        println("Element at ${listIterator.nextIndex()} is ${listIterator.next()}")
    }

    while (listIterator.hasPrevious()) {
        println("Element at ${listIterator.previousIndex()} is ${listIterator.previous()}")
    }
}
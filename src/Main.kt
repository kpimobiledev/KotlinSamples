fun main() {
    val isMorning = true
    var isAwake = false

    if (isMorning && !isAwake) println("Bring me coffee")

    isAwake = true // Try input 1 instead of true

    if (isMorning || isAwake) println("I went to the lecture anyway")

}


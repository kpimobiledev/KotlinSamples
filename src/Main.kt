fun main() {
    val a: Number = 100

    // Processing when with parameter
    when (a) {
        is Int -> println("Number is int")
        is Double -> println("Number is double")
        !is Float -> println("Number is not a float")
        in 0f..10f -> println("Float is in 0 to 10")
        else -> println("I don't know")
    }

    // When expression returning value
    val message = when (a) {
        is Int -> "Number is int"
        is Double -> "Number is double"
        !is Float -> "Number is not a float"
        in 0f..10f -> "Float is in 0 to 10"
        else -> "I don't know"
    }
    println(message)

    // When without parameter returning value
    val someString = "Hello World!"
    val otherMessage = when {
        a in 40..100 && someString.toUpperCase() == someString -> "String is uppercase and a is in 40..60"
        someString.length > 10 -> "$someString is larger than 10 symbols"
        a in 10..20 -> "$a is in 10..20 range"
        a is Double -> "$a is Double"
        else -> "I don't know"
    }

    println(otherMessage)
}


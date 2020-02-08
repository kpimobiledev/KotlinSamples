import java.util.*

fun main() {
    val helloString = "Hello World"
    val concatenatedString = "Hello" + " " + "World"

    val escapedString = "Hello!\nWorld!"
    val rawString = """
        I
        Can
        Do
        Whatever I want
        In this string
        \n is not a symbol
    """.trimIndent()

    val intConcat = "Hello" + 123

    // String is also an array of characters and can be iterated through
    println("$helloString letter by letter:")
    helloString.forEach { println(it) }

    val stringTemplate = "$intConcat length is ${intConcat.length}"
    println(stringTemplate)
}


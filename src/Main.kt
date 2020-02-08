fun main() {
    val myChar = 'a'
    val tabChar = '\t'
    val unicodeChar = '\uFF00'

    // Chars and Ints compatibility
    println("Comparing Char to Int: ${myChar.toInt() == 1}") // Try to remove toInt()

    // Chars and ranges
    println("$myChar is from a to z: ${myChar in 'a'..'z'}")
    println("$unicodeChar is not from 1 to 9: ${unicodeChar !in '1'..'9'}")
}


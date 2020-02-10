fun main() {
    var animal = Animal.CAT
    animal = Animal.DOG

    var currency = Currency.UAH
    currency.someOtherValue = "value"
    currency.printSymbol()

    // When-expression doesn't require else if all enum values are options
    val message = when (currency) {
        Currency.UAH -> "Hryvnia"
        Currency.EUR -> "Euro"
        Currency.USD -> "Dollar"
    }

    println(message)
}

// Simple enum class
enum class Animal {
    CAT,
    DOG
}

// Enum class with constructor, additional value and a method
enum class Currency(private val symbol: Char) {
    USD('$'),
    UAH('₴'),
    EUR('€');

    var someOtherValue: String? = null

    fun printSymbol() {
        print(symbol)
    }
}


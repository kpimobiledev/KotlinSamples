fun main() {
    // Creating an object of an empty class
    val empty = Empty()

    // Creating a person
    val person = Person("John", 20)
    val namedParamsPerson = Person(age = 20, name = "John")

    // Init block will be executed on object creation
    val personWithInit = PersonWithInit("John", 20)

    // Init block with calculated fields will be executed on object creation
    val personWithFields = PersonWithFields("John", 20)
    println(personWithFields.canDrive) // Accessible field

    // Creating person with constructor fields
    val personWithConstructorFields = PersonWithConstructorFields("John", 20)
    println(personWithConstructorFields.age) // Accessible field

    // Creating person with default args
    val firstPerson = PersonWithDefaultArguments("John", 20)
    val secondPerson = PersonWithDefaultArguments("Jane")

    // Try to uncomment the line below
    // val secretivePerson = SecretivePerson("Secret")
}

// Empty class without fields/methods and with empty constructor
class Empty

// Also an empty class definition
class AlsoEmpty {}

// Defining a class with its main constructor
class Person constructor(name: String, age: Int)

// Or just like that
class AnotherPerson(name: String, age: Int)

// This class has initialization block: called once the object is created
class PersonWithInit(name: String, age: Int) {
    init {
        println("$name is $age years old")
    }
}

// This class has fields assigned with values based on constructor arguments
class PersonWithFields(name: String, age: Int) {
    private val capitalizedName = name.toUpperCase() // only accessible inside the class
    var canDrive = age >= 18

    init {
        println("$capitalizedName can drive: $canDrive")
    }
}

// Fields and their visibility modifiers can be defined right in primary constructor
class PersonWithConstructorFields(private val name: String, val age: Int)

// This class has secondary constructor
class PersonWithMultipleConstructors(val name: String) {
    var age: Int? = null

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}

// Fields can be defined right in primary constructor
class PersonWithDefaultArguments(val name: String, val age: Int = 100)

// Constructors can have visibility modifiers too
class SecretivePerson private constructor(secret: String)
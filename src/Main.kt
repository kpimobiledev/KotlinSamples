fun main() {
    // Accessing the fields of an object
    val person = Person()
    println(person.name)
    person.age = 100
    person.phoneNumber = "+1234567890"

    // Using lateinit property
    person.drivingLicense = "A123456"
    println(person.drivingLicense)

    // Using custom-getter field
    println("Name length is ${person.nameLength}")

    // Using custom-getter and custom-setter field
    person.address = "New address"
    println("Address is set to ${person.address}")

    // Using class methods
    person.sayHello()
    val shippingAddress = person.getShippingAddress()

    // Using static field of a Person class
    println(Person.DEFAULT_ADDRESS)

    // Using static method of a Person class
    val anotherPerson = Person.create(20, "+1234567890")
}


// Class with different properties
class Person {

    // Some simple fields
    val name: String = "John"
    var age: Int = 40
    var phoneNumber: String? = null

    // This field is not initialized yet, it will be initialized in future
    lateinit var drivingLicense: String

    // Field with custom getter
    val nameLength: Int
        get() {
            return name.length
        }

    // Field with custom setter and getter
    var address: String = DEFAULT_ADDRESS
        set(value) {
            println("I'm a custom setter, setting address to $value")
            field = value
        }
        get() {
            println("I'm a custom getter, getting $field")
            return field
        }

    // Class method accepting no args, returning nothing
    fun sayHello() {
        println("I'm $name")
    }

    // Class method returning value
    fun getShippingAddress() = "$address, $phoneNumber"

    // Used for static fields and methods
    companion object {

        // A compile-time constant example
        const val DEFAULT_ADDRESS = "Default address"

        // Static factory method
        fun create(age: Int, phone: String): Person {
            return Person().apply {
                this.age = age
                this.phoneNumber = phone
            }
        }
    }
}


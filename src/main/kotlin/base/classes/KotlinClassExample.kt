@file:JvmName("ForUseFromJava") // Name for use from Java classes.
package base.classes


class KotlinClassExample {

    val first = "First"

    val second
        get() = "second"

    val third = "third"
        get() = "$field 1"

    // Use getter for backing property.
    private val safeValue = mutableListOf<Int>()
    val safeValueGetter: List<Int> get() = safeValue

    // getter return field
    val value = "Value"
        get() {
            println("Somebody wants to get this '$field'")
            return field
        }

    // getter returns another properties
    val AllInfo: String
        get() = "first: $first, second: $second, third: $third"

    // default setter
    var name = ""
        set(value) {
            field = value
        }

    // setter
    var age = 0
        set(value) {
            field = if (value < 0) {
                println("Age can't be negative")
                0
            } else value
        }

}

class ConstructorProperties(name: String, age: Int) {
    var fullName: String = name
        set(value) {
            println("Name is changing. Old name is $fullName, new name is $value")
            field = value
        }
}

class SecondaryConstructor {

    private var number: Int
    private var default = 0

    init {
        println("Object is created. Default area is $default")
    }

    constructor(number: Int) {
        this.number = number
        println("Number is set to $number. Default is $default")
    }

    constructor(number: Int, default: Int) {
        this.number = number
        this.default = default
        println("Number is set to $number. Default is $default")
    }

}

class Delegation(val a:Int, val b:Int) {

    private var area = a * b

    constructor(a:Int, b:Int, border:Int): this(a, b) {
        this.area += border
    }

}

fun main() {
    val example = KotlinClassExample()
    println(example.third)
    // example.safeValueGetter.add(1) is not compile
    example.value
    println(example.AllInfo)
    example.age = -1
    println(example.age)
    example.age = 5
    println(example.age)
    val example2 = ConstructorProperties("Default Name", 18)
    example2.fullName = "New name"

    val number = 5
    val secodrary1 = SecondaryConstructor(number = number)
    val secodrary2 = SecondaryConstructor(5, 5)

    val delegation = Delegation(5,5, 10)
}

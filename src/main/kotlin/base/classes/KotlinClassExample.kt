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
}

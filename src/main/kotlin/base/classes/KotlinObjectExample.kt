package base.classes

import kotlin.io.path.Path

fun main() {

    // One object reference.
    val first = Properties
    val second = Properties
    println("the same object reference: ${first === second}")

    //Get object fields.
    println(Properties.name)

    // Nested object.
    println("os: ${Properties.Hardware.OS}")
    println("name: ${MyClass(MyClass.DefaultValues.name).name}")

}

object Properties {

    val name = "Name"
    val path = Path("/path/to/app")

    object Hardware {
        val OS = "My operating system"
    }
}

class MyClass(val name: String) {

    object DefaultValues {
        val name = "Default"
    }

}


package base.enums

fun main() {

    // use enum object
    val green = Colors.GREEN

    // use enum fields
    val redGgb = Colors.RED.rgb

    // use enum name
    println("Green enum name is ${Colors.GREEN.name}")

    // use enum position number
    println("Green position number is ${Colors.GREEN.ordinal}")

    // Use enum methods
    Colors.GREEN.printInfo()
    println("Colors enum has 'red': ${hasColor("red")}")

    // use enum valueOf()
    println("Find RED: ${Colors.valueOf("red")}")

}

enum class Colors(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    GREEN("Green", "#00FF00");

    fun printInfo() {
        println("name: ${this.color}, rgb: ${this.rgb}")
    }

}

/**
 * Iterate through this enum and find any color match to given color.
 */
fun hasColor(input: String): Boolean {
    for (enum in Colors.values()) {
        if (input.uppercase() == enum.name) return true
    }
    return false
}
package base.collections

fun main() {

    build() // Create with builder.

    // Add elements
    mutableSetOf("One").add("Two") // [One, Two]

    // Add all from another Set.
    mutableSetOf("One").addAll(setOf("Two")) // [One, Two]

    // Concatenation
    println(setOf("One") + setOf("Two")) // [One, Two]

    // Subtraction.
    println(setOf("One", "Two") - setOf("Two")) // [One]

    // To Set.
    println(listOf(0, 0, 1, 1).toSet()) // [0, 1]

    // To Mutable Set.
    val set = setOf(0, 1, 2, 3, 4, 5).toMutableSet()

    // Remove all that also contained in another collection.
    set.removeAll(setOf(0, 1, 2, 3))
    println(set) // [4, 5]

    // Remove element.
    set.remove(5)
    println(set) // [4]

    // Clear.
    set.clear()
    println(set) // []

}

fun build() {
    val set = buildSet<Int> {
        add(0)
        add(1)
        add(1)
        addAll(setOf(11, 11, 11))
    }
    println(set) // [0, 1, 11]
}
package base.collections

fun main() {
    createMapExamples()
    iteratingMap()
    changingMap()
}

private fun createMapExamples() {

    val map = mutableMapOf<Int, String>(
        Pair(0, "Zero"),
        Pair(1, "One"),
        Pair(2, "Two")
    )

    val map2 = mapOf(
        0 to "zero",
        1 to "one"
    )

    val map3 = buildMap<Int, String> {
        put(1, "one")
        putAll(map)
    }



    val p = Pair(1, 2)
    println(p)

    val (first, second) = p
    println("$first $second")

}

private fun iteratingMap() {
    val map = mapOf(0 to "zero", 1 to "one")
    for ((k, v) in map) {
        println("$k $v")
    }
}

fun changingMap() {
    val map = mutableMapOf(0 to "zero", 1 to "one")
    map -= 1
    map += 2 to "two"
    println(map)
}

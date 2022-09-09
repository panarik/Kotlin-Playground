package base.loops

class LoopExamples {

    /**
     * Looping in array.
     */
    fun forLoop(line: Array<Int>) {
        for (digit in line) println(digit)
    }

    /**
     * Range looping.
     */
    fun rangeLoop() {
        for (i in 1..5) println(i)
    }

    /**
     * Range looping. Loop until index 5 coming.
     */
    fun rangeUntilLoop() {
        for (i in 0 until 5) println(i)
    }

    /**
     * Range looping with steps and backwards.
     */
    fun rangeStepsBackwardsLoop() {
        for (i in 9 downTo 1 step 2) println(i)
    }

    /**
     * Map looping.
     */
    fun mapIterate(map: Map<Int, String>) {
        for ((key, value) in map) println("$key = $value")
    }

    /**
     * List looping.
     */
    fun listIterate(list: List<String>) {
        for ((index, element) in list.withIndex()) {
            println("$index: $element")
        }
    }

    /**
     * Looping over string.
     */
    fun stringIterate(string: String) {
        for (ch in string) println(ch)
    }

    /**
     * Looping over chars in bytes indexes.
     */
    fun charsIterate() {
        for (ch in 'a'..'d') println(ch)
    }

    /**
     * Loop with standard function repeat(times: Int, action: (Int) -> Unit).
     */
    fun repeatLoop(string: String, times: Int) {
        repeat(times) { println(string) }
    }

}

fun main() {
    val loopExamples = LoopExamples()

    println("\nLooping in array:")
    loopExamples.forLoop(arrayOf(1, 2, 3))

    println("\nRange looping:")
    loopExamples.rangeLoop()

    println("\nRange looping until 5 coming.")
    loopExamples.rangeUntilLoop()

    println("\nRange looping with steps and backwards.")
    loopExamples.rangeStepsBackwardsLoop()

    println("\nMap iterate:")
    loopExamples.mapIterate(mapOf(1 to "One", 2 to "Two", 3 to "Three"))

    println("\nList iterate:")
    loopExamples.listIterate(listOf("One", "Two", "Three"))

    println("\nString iterate:")
    loopExamples.stringIterate("Hello!")

    println("\nChars indexes iterate:")
    loopExamples.charsIterate()

    println("\nRepeat function:")
    loopExamples.repeatLoop("#", 5)
}


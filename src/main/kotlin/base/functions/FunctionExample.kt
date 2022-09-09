package base.functions

class FunctionExample {

    // Return Unit (void)
    fun unit(): Unit {
        // do some code without return option.
    }

    /**
     * Method with simplify return statement example.
     */
    fun returnMax2(a: Int, b: Int): Int = if (a < b) a else b // Just return Int.

    /**
     * Method with simplify return statement example.
     */
    fun returnInt() = 1 // Just return Int.

    /**
     * Method with default params example.
     */
    fun printChars(character: Char = '_', times: Int = 1) {
        repeat(times) { print(character) }
    }

    /**
     * Use method with default parameters from Java.
     */
    @JvmOverloads
    fun add(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

}


fun main(args: Array<String>) {

    val functionExample = FunctionExample()

    // Use method with default params.
    functionExample.printChars()

    // Use method with default params.
    functionExample.printChars('#', 5)

    // Use method with default params using tags.
    functionExample.add()
    functionExample.add(a = 1)
    functionExample.add(b = 2)
    functionExample.add(c = 3)
    functionExample.add(a = 1, b = 1)
    functionExample.add(b = 1, c = 1)
    functionExample.add(a = 1, c = 1)
    functionExample.add(a = 1, b = 1, c = 1)
}

// Functions leveling.
// - Top level function.
fun topLevelFunctionEx() = 0


class A {

    // - Member function.
    fun function() = 1

    // - Local function.
    fun topLevelFunc() {
        fun localFunc() = 1
    }

}
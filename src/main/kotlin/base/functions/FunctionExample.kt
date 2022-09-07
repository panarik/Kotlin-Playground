package base.functions

// Functions leveling.
// - Top level function.
fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
}

// - Member function.
class A {
    fun function() = 1
}

// - Local function.
fun topLevelFunc() {
    fun localFunc() = 1
}


// Return Unit (void)
fun unit(): Unit {
    // do some code without return option.
}

// Return something.
fun returnMax2(a: Int, b: Int): Int = if (a < b) a else b // Just return Int.
fun returnInt() = 1 // Just return Int.
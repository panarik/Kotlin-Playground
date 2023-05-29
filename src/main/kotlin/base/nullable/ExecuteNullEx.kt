package base.nullable

fun main() {
    safeCall()
    executeOrNull()
    nullableBoolean()
    valueOrDefault(null)
}

fun safeCall() {
    val nullable: String? = null
    println(nullable?.length)
}

fun executeOrNull() {
    val value: Int? = null
    value?.let { println("Its not null: $value") }
}

fun nullableBoolean() {
    val b: Boolean? = null
    if (b == true) println("true")
    else println("false or null.")
}

/**
 * Returns value if not null. Returns -1 if null.
 */
fun valueOrDefault(number: Int?) {
    println(number ?: -1)
}

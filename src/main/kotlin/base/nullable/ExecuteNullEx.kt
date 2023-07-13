package base.nullable

fun main() {
    safeCall()
    executeIfNotNull()
    nullableBoolean()
    valueOrDefault(null)
}

fun safeCall() {
    val nullable: String? = null
    println("Safe call .length method: ${nullable?.length}") // null.
}

fun executeIfNotNull() {
    val value: Int? = null
    value?.let { println("Its not null: $value") } // will not execute.
}

fun nullableBoolean() {
    val b: Boolean? = null
    if (b == true) println("true")
    else println("false or $b.") // null.
}

/**
 * Returns value if not null. Returns -1 if null.
 */
fun valueOrDefault(number: Int?) {
    println(number ?: -1) // -1
}

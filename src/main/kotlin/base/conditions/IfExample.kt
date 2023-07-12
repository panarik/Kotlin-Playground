package base.conditions


fun main() {

    // 'If' like expression.
    val a = 1
    val result = if (a > -1) "Positive" else "Negative"
    println(result)

    // 'If' with return statement
    max(1, 2)

    //
}

/**
 * Function with 'If' return statement.
 */
fun max(a: Int, b: Int): Int = if (a > b) a else b



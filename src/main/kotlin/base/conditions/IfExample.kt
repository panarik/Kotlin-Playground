package base.conditions

class IfExample {

    /**
     * Function with 'If' return statement.
     */
    fun max(a: Int, b: Int): Int = if (a > b) a else b

}

fun main() {

    // 'If' like expression.
    val a = 1
    val result = if (a > -1) "Positive" else "Negative"
    println(result)

    // 'If' with return statement
    IfExample().max(1, 2)
}



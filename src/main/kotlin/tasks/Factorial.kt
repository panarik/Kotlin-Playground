package tasks

fun main() {
    println(factorial(2))
    println(factorial(3))
    println(factorial(4))
}

private fun factorial(number: Int): Int {
    var factorial = 1
    for (i in 1..number) factorial *= i
    return factorial
}

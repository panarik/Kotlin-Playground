package base.operators

fun main() {
    val something = false
    val name = if (something) "True" else "False"
    println(name)
}


fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
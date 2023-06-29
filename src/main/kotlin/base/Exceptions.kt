package base

fun main() {
    val x = 1

    require(x < 1) { "Less than one." } // throws IllegalArgumentException
    check(x < 1) { "Less than one." } // throws IllegalStateException

}
package base.concat

fun main() {
    val one = "one"
    val two = 2
    val three = "three"
    println("$one plus $two equal $three.")
    println("some text and ${call("input")} ")

}

fun call(input: String): String {
    return input
}
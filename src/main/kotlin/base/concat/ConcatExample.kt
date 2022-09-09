package base.concat

class ConcatExample {

    fun call(input: String): String {
        return input
    }

}

fun main() {
    val concatExample = ConcatExample()
    val one = "one"
    val two = 2
    val three = "three"
    println("$one plus $two equal $three.")
    println("some text and ${concatExample.call("input")} ")
}


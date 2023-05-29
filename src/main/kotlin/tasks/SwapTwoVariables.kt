package tasks

fun main() {
    var a = "a"
    var b = "b"
    a = b.also { b = a }
    println("a=$a, b=$b")
}

package base.variables

fun main() {

    // Read only
    val read1 = "read1"
    val read2 = "read2"
    // read1 = read2

    // Mutable
    var a = "a"
    var b = "b"

    a = b
    println(a)

    // multiple
    val (s1, s2) = readln().split(" ")
    println(s1)
    println(s2)

}
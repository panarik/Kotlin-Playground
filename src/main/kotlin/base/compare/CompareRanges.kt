package base.compare

import base.compare.data.MyDate

fun main() {
//    compare()
    referentialEquality()
}

fun compare() {
    val myFirstDate = MyDate(1900)
    val mySecondDate = MyDate(2000)
    println(myFirstDate.compareTo(mySecondDate))
}

fun referentialEquality() {
    val one = MyDate(1)
    val two = one
    val three = MyDate(1)

    // The same object
    println(one === two) // true, two points to one (reference equals)
    println(one === three) //false, points to different objects.

    var a = 2
    var b = 2
    println("a == b: ${a === b}") // true. The same object too.
    b = 3
    println("a == b: ${a === b}") // false. Point to different object.
}


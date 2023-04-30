package base.arrays

fun main() {

    val emptyArray = emptyArray<Int>()
    println("Create empty array: ${emptyArray.contentToString()}")

    val arrayNulls = arrayOfNulls<Int>(10)
    println("Create empty array with size: ${arrayNulls.contentToString()}")

    val arrayConstructor = Array(10) { i -> i + 1 }
    println("Create by constructor: ${arrayConstructor.contentToString()}")

    val arrayWithArrays = Array(10) { Array(10) { _ -> 0 } }
    for (i in arrayWithArrays.indices) println("Array #$i: ${arrayWithArrays[i].contentToString()}")

    // Sort
    val arrayCustom = arrayOf(20, 5, 2, 50, 0, -34)
    arrayCustom.sort()
    println(arrayCustom.contentToString())


}
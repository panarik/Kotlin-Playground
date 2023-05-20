package base.arrays

fun main() {

    createArrays()
    sortArrays()
    toString()
}

fun createArrays() {
    var emptyArray = emptyArray<String>()
    emptyArray += "One"
    emptyArray += "Two"
    println("Create empty array: ${emptyArray.contentToString()}")

    val arrayNulls = arrayOfNulls<Int>(10)
    println("Create empty array with size: ${arrayNulls.contentToString()}")

    val arrayConstructor = Array(10) { i -> i + 1 }
    println("Create by constructor: ${arrayConstructor.contentToString()}")

    val arrayWithArrays = Array(10) { Array(10) { _ -> 0 } }
    for (i in arrayWithArrays.indices) println("Array #$i: ${arrayWithArrays[i].contentToString()}")

    val intArray = IntArray(5)
    println("Create by IntArray class: ${intArray.contentToString()}")

    val array: Array<Int> = "1 2 3 4 5".split(" ").map { it.toInt() }.toTypedArray()
    println("Create from string: ${array.contentToString()}")
}

fun sortArrays() {
    val arrayCustom = arrayOf(20, 5, 2, 50, 0, -34)
    arrayCustom.sort()
    println("Sorted array: ${arrayCustom.contentToString()}")
}

fun toString() {
    val array = Array(10) { it.inc() }
    println("String from array with delimiter \"\" : ${array.joinToString("")}")
}

fun getData() {
    val array = Array(10) { it.inc() }
    array.last()
}
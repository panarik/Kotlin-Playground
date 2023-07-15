package base.arrays

fun main() {

    createArrays()
    useArrays1()
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

    val arrayOf = arrayOf("one", "two", "three", "four")
    println(arrayOf.joinToString(", "))

    val arrayConstructor = Array(10) { i -> i + 1 }
    println("Create by constructor: ${arrayConstructor.contentToString()}")

    val arrayWithArrays = Array(10) { Array(10) { _ -> 0 } }
    for (i in arrayWithArrays.indices) println("Array #$i: ${arrayWithArrays[i].contentToString()}")

    val intArray = IntArray(5)
    println("Create by IntArray class: ${intArray.contentToString()}")

    val array: Array<Int> = "1 2 3 4 5".split(" ").map { it.toInt() }.toTypedArray()
    println("Create from string: ${array.contentToString()}")
}

fun useArrays1() {
    println("\nUse arrays.")
    val array = Array(5) { Array(5) { 0 } }
    for (i in array.indices) println("$i: ${array[i].joinToString(" ")}")
    array[0][1] = 1
    for (i in array.indices) println("$i: ${array[i].joinToString(" ")}")
}

fun useArrays2() {

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
package base.collections

fun main() {
    buildList()
    convertToString()
}

fun buildList() {

    // Read only list.
    val readOnlyList = listOf("One", "Two", "Three")

    // Mutable list
    val mutableList = mutableListOf("One", "Two", "Three")
    mutableList.add("Four")
    for (item: String in mutableList) println(item)

    // List builder
    val list: List<Int> = buildList { for (i in 0..10) add(i) }
    println("Created with builder: $list")
}

fun convertToString() {
    println("\nCollection to String:")
    val list = listOf("One", "Two", "Three")
    println("Default: $list")
    val output = list.joinToString(separator = ";", prefix = "{", postfix = "}")
    println("Custom: $output")
}
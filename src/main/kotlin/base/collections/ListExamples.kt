package base.collections

fun main() {

    // Read only list.
    val readOnlyList = listOf("One", "Two", "Three")

    // Mutable list
    val mutableList = mutableListOf("One", "Two", "Three")
    mutableList.add("Four")
    for (item: String in mutableList) println(item)

}
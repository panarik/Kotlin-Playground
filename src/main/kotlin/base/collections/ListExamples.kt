package base.collections

import java.util.LinkedList

fun main() {
    buildList()
    convertToString()
    workWithList()
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

    // linked list
    val linked: LinkedList<Int> = LinkedList()
    linked.add(0)
    linked.addFirst(-1) // Add to first.
    linked.add(1) // Add to last.
    linked.addLast(2) // Add to last.
    linked.push(10) // Add to first.
    println("Linked list: $linked, Peek first:${linked.peek()}")
}

fun workWithList() {
    val numbers = listOf(1, 5, 10, -5, 100, 0)
    val words = listOf("abc","bcd","aaaa","cbc")

    // Filter.
    println("Filtered list: ${numbers.filter { it > 0 }}")

    // Contains.
    println(1 in numbers) // true.

    // mapTo
    println(words.map{it.length})
    println(words.mapIndexed{index, s -> s+index})
    println(words.mapIndexedNotNull{index, s -> if (s.contains('a')) index else null})
}

fun convertToString() {
    println("\nCollection to String:")
    val list = listOf("One", "Two", "Three")
    println("Default: $list")
    val output = list.joinToString(separator = ";", prefix = "{", postfix = "}")
    println("Custom: $output")
}
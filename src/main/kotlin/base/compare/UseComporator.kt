package base.compare

import java.util.LinkedList

// Integers.
val ascending = compareBy<Int> { it }
val descending = compareByDescending<Int> { it }
val reversed = ascending.reversed()
val firstZero = compareBy<Int> { it != 0 }
val firstZeroThenASC1 = firstZero.thenBy { it }
val firstZeroThenASC2 = firstZero.then(ascending)

// Max and Min of 3.
val maxOf = maxOf("aa", "AA", "bbb", compareBy { it.length })

// Compare of two.
val compareValuesBy = compareValuesBy("aa", "bbb") { it.length }

// Nullable
fun nullsLast(list: List<Int?>): List<Int?> =
    list.sortedWith(nullsLast())

fun main() {
    val list = listOf(0, 10, 5, -5, 100, 2, 50, -50)
    println(list.sortedWith(firstZeroThenASC1))
    println(nullsLast(list))
    println(maxOf)
}






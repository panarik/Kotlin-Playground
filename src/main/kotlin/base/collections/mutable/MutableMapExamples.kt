package base.collections.mutable

import java.util.HashMap

fun main() {

    createMap()
}

private fun createMap() {

    val createByFunction = mutableMapOf(Pair(1, "One"), Pair(2, "Two"))
    val createByConstructor = HashMap<Int, String>(createByFunction)
    createByConstructor[1] = "One!"
    println(createByConstructor)
}

package base.compare

fun main() {
    println(isString("string")) // true
    println(isString(5)) // false
}

fun isString(objectType:Any ):Boolean =
    objectType is String

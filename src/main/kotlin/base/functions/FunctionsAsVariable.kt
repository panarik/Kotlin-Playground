package base.functions

/**
 * variable with function reference.
 */
val m = ::sum

/**
 * Variable with explicitly function return value.
 */
var sumFunction: (Int, Int) -> Int = ::sum


fun main() {
    println("Function from variable '$sumFunction' with params (2,2) has result ${sumFunction(2, 2)}")
}

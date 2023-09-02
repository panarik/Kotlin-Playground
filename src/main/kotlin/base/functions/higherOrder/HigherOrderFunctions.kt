package base.functions.higherOrder


/**
 * Higher-order function with another function as param.
 */
private fun smartCalc(a: Int, b: Int, calc: (a: Int, b: Int) -> Int) {
    println(calc(a, b))
}

private fun mySum(a: Int, b: Int): Int = a + b

private fun myMultiple(a: Int, b: Int): Int = a * b


fun main() {

    // Use custom higher-order function.
    smartCalc(5, 5, ::mySum)
    smartCalc(5, 5, ::myMultiple)

    // Use existed higher-order function.
    val numbers = listOf(10, 20, 30, 40, 50)
    numbers.fold(0) { temp: Int, nextNumber: Int ->
        print("temp = $temp, nextNumber = $nextNumber, ")
        val result = temp + nextNumber
        println("temp = $result")
        result
    }

    // Parameter types in a lambda are optional if they can be inferred:
    val joinedToString = numbers.fold("Elements:", { temp, nextNumber -> temp + " " + nextNumber })

    // Function references can also be used for higher-order function calls:
    val product = numbers.fold(1, Int::times)

    println("joinedToString = $joinedToString")
    println("product = $product")
}
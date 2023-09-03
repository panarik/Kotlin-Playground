package base.functions.higherOrder


/**
 * Higher-order function with another function as param.
 */
private fun printNumbers(numbers: List<Int>, func: (Int) -> Boolean) {
    println(numbers.filter(func))
}


fun main() {

    // Use custom higher-order function.
    printNumbers(listOf(1, 2, 3, 4, 5), ::isOdd)
    printNumbers(listOf(1, 2, 3, 4, 5), ::isEven)

    // Use existed higher-order function.
    val numbers = listOf(10, 20, 30, 40, 50)
    numbers.fold(0) { temp: Int, nextNumber: Int ->
        print("temp = $temp, nextNumber = $nextNumber, ")
        val result = temp + nextNumber
        println("temp = $result")
        result
    }
}

private fun isOdd(digit: Int) = digit % 2 == 0

private fun isEven(digit: Int) = digit % 2 != 0
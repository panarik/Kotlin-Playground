package base.functions.lambdas

class LambdaExample {

    /**
     * Variable using anonymous function with args.
     */
    val multi1 = fun(a: Int, b: Int): Int { return a * b }

    /**
     * Variable using anonymous function with args.
     */
    val multi2 = { a: Int, b: Int -> a * b }

    /**
     * Variable using anonymous function without args.
     */
    val withoutArgs = { 2 * 2 }

    /**
     * Variable using anonymous function without args.
     */
    val textWithoutDots1 = "I don't know... what to say...".filter({ c: Char -> c != '.' })

    /**
     * Variable using lambda function.
     */
    val textWithoutDots2 = "I don't know... what to say...".filter { it != '.' }

    val textWithoutSmallDigits = "abcd !? 123456789 abcd !?".filter {
        return@filter if (it.isDigit()) it.digitToInt() >= 5
        else true
    }
}

class CapturingVariables {

    var count = 0

    var addPoint = {
        count++
        println(count)
    }

}


fun main() {

    val lambdas = LambdaExample()
    println(lambdas.multi1(2, 2))
    println(lambdas.multi2(2, 2))
    println(lambdas.textWithoutSmallDigits)

    val capturing = CapturingVariables()
    println(capturing.count) // 0
    capturing.addPoint() // 1
    capturing.count += 10
    capturing.addPoint() // 12
}






package base.functions

/**
 * variable with function reference.
 */
val m = ::sum

/**
 * Variable with explicitly function return value.
 */
var sumFunction: (Int, Int) -> Int = ::sum

/**
 * Function that returns another function.
 */
private fun getScoringFunction(isCheater: Boolean): (Double) -> Double =
    if (isCheater) ::getGradeWithPenalty
    else ::getRealGrade


private fun getRealGrade(x: Double): Double = x

private fun getGradeWithPenalty(x: Double) = x - 1

/**
 * object with reference to getScoringFunction.
 */
val scoringForCheater = getScoringFunction(true)

val scoringForNormal = getScoringFunction(false)

/**
 * value with function result.
 */
val result: Double = scoringForCheater(5.0)

fun main() {
    println("Function from variable '$sumFunction' with params (2,2) has result ${sumFunction(2, 2)}")
    println("Calculates normal score: ${scoringForNormal(5.0)}.")
    println("Calculated score for cheaters: ${scoringForCheater(5.0)}")
}

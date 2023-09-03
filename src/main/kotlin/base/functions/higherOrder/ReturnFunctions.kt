package base.functions.higherOrder


/**
 * Higher-order function with another function as return value.
 */
private fun getScoreRule(isCheater: Boolean): (Double) -> Double =
    if (isCheater) ::getGradeWithPenalty
    else ::getGrade

fun main() {

    //Use body function directly.
    println("Init score: 5.0, current score for cheater: ${getScoreRule(true)(5.0)}")

    // Use body function as variable.
    val getScore = getScoreRule(false)
    println("Init score: 5.0, current score: ${getScore(5.0)}")

}

private fun getGrade(score: Double): Double = score

private fun getGradeWithPenalty(score: Double): Double = score - 1
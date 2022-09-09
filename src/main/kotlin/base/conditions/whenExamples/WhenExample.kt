package base.conditions.whenExamples


import base.conditions.whenExamples.data.Cat
import base.conditions.whenExamples.data.Dog
import base.conditions.whenExamples.data.Pets
import java.awt.Color
import java.awt.Color.*

fun main() {
    petSound()
}

/**
 * 'When' expression.
 */
fun getWeather(color: Color): String =
    when (color) {
        BLUE -> "cold"
        ORANGE -> "warm"
        BLUE -> "cold"
        RED -> "hot"
        else -> "unknown"
    }

/**
 * 'When' expression with several values at the same condition.
 */
fun getResponse(input: String): String =
    when (input) {
        "y", "yes" -> "Positive response"
        "n", "not" -> "Negative response"
        else -> "Unknown response"
    }

/**
 * 'When' expression with different functions as conditions.
 */
fun mix(c1: Color, c2: Color): Color =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(BLUE, YELLOW) -> GREEN
        else -> throw Exception("Unknown color")
    }

/**
 * 'When' expression with smart cast object.
 */
fun animalCall(animal: Any) {
    when (animal) {
        is Cat -> animal.meow()
        is Dog -> animal.bank()
    }
}

/**
 * 'When' expression with capturing subject in a variable.
 */
fun petSound() =
    when (val animal = Pets().getPet()) {
        is Cat -> animal.meow()
        is Dog -> animal.bank()
        else -> print("Unknown sound")
    }

/**
 * 'When' expression without argument.
 */
fun getWeather(degrees: Int): Pair<String, Color> =
    when {
        degrees < 5 -> "cold" to BLUE // Any boolean expression.
        degrees < 25 -> "warm" to ORANGE // Any boolean expression.
        else -> "hot" to RED
    }

package base.conditions.inRange

class InRangeExample {

    /**
     * Define digit belongs to 0-9 range.
     */
    fun intInRange(digit: Int): Boolean {
        val digits: IntRange = 0..9
        return digit in digits
    }


    /**
     * Define Symbol belongs to a-z range or A-Z range.
     * @param char Symbol for checking.
     */
    fun charInRange(char: Char): Boolean {
        val lowerLetters: CharRange = 'a'..'z'
        val upperLetters: CharRange = 'A'..'Z'
        return char in lowerLetters || char in upperLetters  // char in 'a'..'z' || char in 'A'..'Z'
    }

    /**
     * Define Symbol NOT belongs to 0-9 range
     * @param char Symbol for checking.
     */
    fun charNotInRange(char: Char): Boolean {
        val digits: CharRange = '0'..'9'
        return char !in digits // char !in '0'..'9'
    }

    /**
     * Using 'when' expression to define Symbol belongs to.
     */
    fun whenCondition(char: Char) = when (char) {
        in '0'..'9' -> "It's a digit."
        in 'a'..'z', in 'A'..'Z' -> "It's a letter."
        else -> "Unknown symbol"
    }

    /**
     * Define String belongs to range from "ab" at "az".
     * @param string Symbol for checking.
     */
    fun stringCondition(string: String, from:String, to:String): Boolean {
        val stringRange: ClosedRange<String> = from..to
        return string in stringRange // string in "ab".."az"
    }

}

fun main() {
    val obj = InRangeExample()
    println("Digit '3' belongs to range from 0 at 9: ${obj.intInRange(3)}")
    println("Digit '23' belongs to range from 0 at 9: ${obj.intInRange(23)}")
    println("Char 'g' is a letter: ${obj.charInRange('g')}")
    println("Char '*' is a letter: ${obj.charInRange('*')}")
    println("Char '*' is NOT a digit: ${obj.charNotInRange('*')}")
    println("Char '1' is NOT a digit: ${obj.charNotInRange('1')}")
    println("Char 'f'. ${obj.whenCondition('f')}")
    println("Char ';'. ${obj.whenCondition(';')}")
    println("String 'as' belongs to range from 'ab' at 'az': ${obj.stringCondition("as", "ab", "az")}")
    println("String 'a2' belongs to range from 'ab' at 'az': ${obj.stringCondition("a2", "ab", "az")}")
    println("String 'Kotlin' belongs to range from 'Java' at 'Scala': ${obj.stringCondition("Kotlin", "Java", "Scala")}")
}
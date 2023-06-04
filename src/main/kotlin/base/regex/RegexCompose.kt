package base.regex

fun main() {
    println(getFirstMatch(Regex("\\d{3}"), "some string with 100_000$"))  // 100
    println(getAllMatches(Regex("\\d{3}"), "some string with 100_000$"))  // [100, 000]
    println(hasMatch(Regex("string"), "some string with 100_000$"))  // true
    println(verifyRegexAgainstEntireString(Regex("some string with [\\d_$]{1,}"), "some string with 100_000$")) // true
}

fun getFirstMatch(regex: Regex, input: String) =
    regex.find(input)?.value ?: "[]"


fun getAllMatches(regex: Regex, input: String): List<String> {
    val result = mutableListOf<String>()
    regex.findAll(input).forEach { result.add(it.value) }
    return result
}

fun hasMatch(regex: Regex, input: String): Boolean =
    regex.containsMatchIn(input)


fun verifyRegexAgainstEntireString(regex: Regex, input: String): Boolean =
    (regex.matchEntire(input)?.value ?: "") == input

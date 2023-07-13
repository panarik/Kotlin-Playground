fun main() {

    val numbersInput =
        "8 2 0 9 3 5 4 2 1 4 7 0 8 6 9 2 6 5 1 0 5 5 1 1 7 9 1 7 5 4 0 9 4 4 3 9 0 4 2 0 5 4 0 2 2 2 1 1 7 4 3 7 5 5 5 8 3 8 6 3 6 8 9 4 7 5 7 1 2 8 4 2 7 6 0 8 4 4 6 9 5 4 2 8 7 7 0 5 8 9 4 3 0 6 3 8 7 6 5 6"
    val numbers = numbersInput.split(" ")
    var result = 0
    numbers.forEach {
        if (it.toInt() == 1) result++
    }
    println(result)

}
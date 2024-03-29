package base.resourses.input

import java.util.*

fun main() {
//    consoleInput()
    whileInputNotEmpty()
//    lineScanner()
//    lineScannerDelimiter()
}

fun consoleInput() {
    println("Console input examples.")
    val scanner = Scanner(System.`in`)

    println("Read line: (For example 'test line')")
    println(scanner.nextLine())

    println("Read digit: (For example '3')")
    println(scanner.nextInt())

    println("Read several digits with spaces: (For example '400 500')}")
    val int1 = scanner.nextInt()
    val int2 = scanner.nextInt()
    println("$int1\n$int2")
}

private fun whileInputNotEmpty() {
    val scanner = Scanner(System.`in`)
    println("Read console and caught empty inputs or spaces.")
    while (scanner.hasNextLine()) {
        val line = scanner.nextLine()
        if (line.isEmpty() || Regex("\\s+").matches(line)) println("empty input")
        else println(line)
    }
}

fun lineScanner() {
    println("Read line: (For example 'one two three')")
    val scanner = Scanner("one two three")
    while (scanner.hasNext()) println(scanner.next())
}

fun lineScannerDelimiter() {
    println("Read string with delimiter: (For example 'test-one')")
    val scanner = Scanner("Test-One")
    scanner.useDelimiter("-")
    while (scanner.hasNext()) println(scanner.next())
}

package base.files

import java.io.File

class FileReader {

    fun fileToString(file: File): String = if (file.exists()) file.readText() else ""

    fun fileToList(file: File): List<String> = file.readLines()

    fun fileReaderLoop(file: File) {
        file.forEachLine { println(it) }
    }

    fun fileToBytes(file: File): ByteArray = file.readBytes()
}

fun main() {
//    readFile()
    writeFile()
}

fun readFile() {
    val home = System.getProperty("user.dir")
    val s = File.separator
    val file = File("src${s}main${s}resources${s}file.txt")

    // Read file.
    val reader = FileReader()
    println(reader.fileToString(file))
    println(reader.fileToList(file))
    println(reader.fileToBytes(file).contentToString())
    reader.fileReaderLoop(file)
}

fun writeFile() {
    val newFile = File("src/main/resources/new_file.txt")
    newFile.writeText("Some text\n")
    repeat(5) {
        newFile.appendText("Additional text from ${System.currentTimeMillis()}\n")
    }
}




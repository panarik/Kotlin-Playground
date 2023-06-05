package base.resourses.files

import java.io.File
import java.io.FileReader
import java.io.FileWriter


fun main() {
    readFile()
    writeFile()
}

fun readFile() {
    // Create file object.
    val home = System.getProperty("user.dir")
    val s = File.separator
    val file = File("src${s}main${s}resources${s}file.txt")

    // Read file.
    val text = FileReader(file).use { it.readText() } // file to string. (auto-closable)
    val string = if (file.exists()) file.readText() else "" // file to string.
    val list = file.readLines() // File to list
    val bytes = file.readBytes() // File to array.
    file.forEachLine { println(it) } // read loop.
}

fun writeFile() {
    val newFile = File("src/main/resources/new_file.txt")
    newFile.writeText("Some text\n")
    newFile.appendText("Additional text from ${System.currentTimeMillis()}\n")

    // Writer.
    FileWriter(newFile).use { it.write("some string") } // write. (auto-closable)
}




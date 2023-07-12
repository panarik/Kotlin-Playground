package base.resourses.files

import java.io.File
import java.io.FileReader
import java.io.FileWriter


fun main() {
//    readFile()
//    writeFile()
//    fileMethods()
//    createFiles()
    directoryMethods()
//    copyFiles()
//    copyDirectories()
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

fun fileMethods() {
    val file = File("src/main/resources/file.txt")
    println("file.txt is directory? ${file.isDirectory}")
    println("file.txt is file? ${file.isFile}")
    println("file.txt parent is: ${file.parentFile}")
}

private fun createFiles() {

    //Create dir
    val newDir = File("src/main/resources/outDir")
    println("outDir is exist? ${newDir.exists()}")
    newDir.mkdir()
    println("outDir is exist? ${newDir.exists()}")
    println("outDir is directory? ${newDir.isDirectory}")

    //Create file
    val newFile = File("src/main/resources/new_file.txt")
    println("new_file.txt is exist? ${newFile.exists()}")
    newFile.createNewFile()
    println("new_file.txt is exist? ${newFile.exists()}")
    println("new_file is file? ${newFile.isFile}")
}

fun directoryMethods() {
    val src = File("src")
    println("dir src is exist? ${src.exists()}")
    println("get files of $src directory: ${src.listFiles().joinToString(" ")}")
    println("\nNew file in this directory will be named: ${src.resolve("new_file.txt")}")

    println("\nWalk TOP_DOWN:")
    src.walk(FileWalkDirection.TOP_DOWN).forEach { println(it) }

    println("\nFind first Examples class:")
    val exampleFile = src.walkTopDown().first{it.name.contains("Examples")}
    println(exampleFile.name)

}

private fun copyFiles() {
    val file = File("src/main/resources/file.txt")
    file.copyTo(File("src/main/resources/copied_file.txt"), overwrite = true)
}

private fun copyDirectories() {
    val dirOne = File("src/main/resources/outDir")
    dirOne.copyRecursively(File("src/main/resources/copiedDir"), overwrite = true)
}



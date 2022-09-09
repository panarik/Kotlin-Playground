@file:JvmName("ForUseFromJava") // Name for use from Java classes.
package base.classes


class KotlinClassExample {

    private val title = "Class title"

    fun getTitle(): String {
        return title
    }

}

// Kotlin static functions.
fun printTitle() {
    println(KotlinClassExample().getTitle())
}

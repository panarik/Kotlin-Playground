package base.classes

class KotlinClassExample {

    private val title = "Class title"

    fun getTitle(): String {
        return title
    }

}

fun main() {
    println(KotlinClassExample().getTitle())
}
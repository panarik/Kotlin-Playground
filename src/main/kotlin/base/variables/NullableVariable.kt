package base.variables

fun main() {

    // Create
    var nullableString: String? = null
    var nullableArray: Array<String>? = null

    // Use
    val result1: Int? = nullableArray?.size // Return null
//    val result2: Int = nullableArray!!.size // Throws NullPointerException
    val result3: Int = nullableArray?.size ?: 0 // check if null
    val result4: Int = if (nullableArray != null) nullableArray.size else 0 // check if null

}

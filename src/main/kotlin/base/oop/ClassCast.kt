package base.oop

fun main() {
    val classType = isObject(Cat()) // is keyword.
    val forceString = forceCastToString(Dog()) // as keyword.
    val nullableString = nullableCasToString(Cat())
    val castIf = ifCast(Cat())
}

fun ifCast(any: Any): String =
    if (any is String) "String!" else "Unknown"

fun nullableCasToString(any: Any): String? =
    any as? String

fun forceCastToString(any: Any) =
    any as String

fun isObject(obj: Any): String =
    when (obj) {
        is Cat -> "Cat"
        is Dog -> "Dog"
        else -> "Unknown object."
    }


class Cat()

class Dog()
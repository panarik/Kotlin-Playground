package base.classes.lazyInit

class LateInit {

    lateinit var a: String

    fun initA(a: String) {
        this.a = a
    }

    fun checkInit() {
        if (this::a.isInitialized)
            println("a is Initialized")
        else
            println("a isn't Initialized")
    }

}

fun main() {

//    println(LateInit().a) // exception.
    val obj = LateInit()
    obj.checkInit()
    obj.initA("value")
    obj.checkInit()

}
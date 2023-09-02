package base.classes.lazyInit

fun main() {

    /**
     * param: LazyThreadSafetyMode.SYNCHRONIZED (the value is only computed in one thread, and all threads will get the same value)
     * param: LazyThreadSafetyMode.PUBLICATION (the lambda can be called several times with an uninitialized lazy object value, but the value that is returned first will be used)
     * param: LazyThreadSafetyMode.NONE (there's no synchronization at all, so if we call the variable from different threads, its value can't be uniquely defined)
     */
    val a: String by lazy() {
        println("is initialized.") // do once if initializing.
        "Hello world!"
    }

    println("Initializing a...")
    println(a)
    Thread.sleep(3000)
    println(a)

}
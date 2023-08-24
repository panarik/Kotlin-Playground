package base.threads

import kotlin.concurrent.thread


fun main() {
    thread(start = true) { timer() }
    timer()
}

private fun timer() {
    for (i in 5 downTo 0) {
        println("Thread: ${Thread.currentThread().name}, remaining: $i")
        Thread.sleep(1000)
    }
}



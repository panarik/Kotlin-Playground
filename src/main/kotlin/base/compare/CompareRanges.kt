package base.compare

import base.compare.data.MyDate

class CompareRanges {



}

fun main() {

    val myFirstDate = MyDate(1900)
    val mySecondDate = MyDate(2000)

    println(myFirstDate.compareTo(mySecondDate))

}
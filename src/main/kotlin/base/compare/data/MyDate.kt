package base.compare.data

class MyDate(private val year: Int) : Comparable<MyDate> {

    override fun compareTo(other: MyDate): Int {
        return this.year - other.year
    }


}
package base.extentions


fun String.repeat():String = this + this



class Client(val name:String, val age:Int) {
    fun getInfo():String = "$name from member, $age from member"
}


fun Client.getInfo():String = "$name from outside, $age from outside" // shadowed by member function.
// fun Client.getInfo() = "$name, $age" // cant compile

fun main() {
    println("ha".repeat())

    val client = Client("John", 25)
    print(client.getInfo())
}

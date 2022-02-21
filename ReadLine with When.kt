fun main() {

    var p = 1..3
    println("Enter x : ")
    var x = readLine()!!.toInt()

    when(x)
    {
        1,5 -> println("one")
        2 -> println("Two")
        else -> {
            println("error")
        }
    }
}


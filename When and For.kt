fun main() {

    var x =4

    when(x)
    {
        1,3 -> println("One")
        in 4..7 -> println("EEE")
        2 -> println("Two")
        else ->
            println("Error")
    }

    //i+=2
    /*for (i in 1..5 step 2)
    {
        println(" i = $i")
       // println("i = "+i)
    }*/

    /*for (i in 4 downTo 1)
        println(" i = $i")*/


    for (i in 1 until 10) {
        println(" i = $i")
    }
}
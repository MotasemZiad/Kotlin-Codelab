import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

class TestFunction {

    fun sum(x: Int, y: Int) {
        var sum = x+y
        println(" sum  = $sum")
    }

    fun sum2(x:Double , y:Double) :Double{
        return  x+y
    }
}

fun main() {
    val s = TestFunction()
    s.sum(3,5)
    var x = s.sum2(3.0,5.9)
    println(x)

    println(max(3,2))
    println(min(3,2))
    println(sqrt(9.0))
}
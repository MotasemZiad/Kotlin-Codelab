fun main() {
    val arr = mutableListOf<String>()
    // the same of arraylist
    val x = ArrayList<String>()

    //static Array
   val y = Array(5) { 2 }

    for (i in y) {
        println(y[i])
    }

    x.add("Ahmad")
    x.add(1, "Mohammed")
    x.add("Hazem")

    arr.add("Ahmad")
    arr.add(1, "Mohammed")
    arr.add("Hazem")

    arr[1] = "Alaa"

    //println(arr)

    for (i in arr) {
        //println(i)
    }

    for (i in x) {
         println(i)
    }

    arr.removeAt(1)

    println(arr.contains("Hazem"))
    println(arr.indexOf("Hazem"))
    println(arr.lastIndexOf("Hazem"))

    for (i in 0 until arr.size) {
        println(arr[i])
    }
}
fun main() {
    println("20 first number of Fibonacci order by descending: ")
    fibonacci()
}

fun fibonacci() {
    val result = ArrayList<Int>()
    var a1 = 0
    var a2 = 1
    result.add(a1)
    result.add(a2)
    var i = 3
    var sum = 0
    while (i++ <= 20) {
        sum = a1 + a2
        result.add(sum)
        a1 = a2
        a2 = sum
    }
    result.sortDescending()
    for (i in result) {
        print("$i ")
    }
}
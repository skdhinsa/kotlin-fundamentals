package Basics

fun main() {

    // while loops
    var num = 1
    var count = 0
    while (num <= 100){
        num *= 2
        println(num)
        count++
    }
    println(count)

    // for-loop closed range
    println("\n for-loops closed range")
    for (i in 1..5) {
        println(i)
    }

    // for-loop open range from 1 to 4, 5 not included
    println("\n for-loops open range")
    for (i in 1 until 5) {
        println(i)
    }

    // for-loop iterate down, closed range
    println("\n for-loops iterate down")
    for (i in 5 downTo 1) {
        println(i)
    }

    // for-loop iterate down, closed range, goes down 2 each time
    println("\n for-loops iterate down 2 steps")
    for (i in 5 downTo 1 step 2) {
        println(i)
    }
    println("\n")
    val a = 1
    val b = 20
    val c = 3
    for(i in a..b step c){
        println(i)
    }

}
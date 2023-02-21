package Basics

fun main() {

    for(i in 1..5)
        print(i)

    println()
    // upside down triangle -> think elements in column = row no
    for(i in 5 downTo 1){  // row -> iterate down
        for(j in 1..i){ // column -> iterate across
            print("*")
        }
        println()
    }

    println()
    for (i in 1..5 step 2){
        for(j in 1..i){
            print("*")
        }
        println()
    }
    for (i in 3 downTo 1 step 2){
        for(j in 1..i){
            print("*")
        }
        println()
    }

    println()
    var spaces = 0
    for (i in 5 downTo 1){
        for(j in 1..spaces){
            print(" ")
        }
        for (k in 1..i){
            print("*")
        }
        println()
        spaces++
    }

}
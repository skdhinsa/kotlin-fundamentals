package SpecialClasses

/*
    Pair class -> pair of values. Data class with two constructor properties
    Propeties are read as first and second.

    Similarly with Triple class.
 */

fun main() {
    // Create a pair
    val pair = Pair(1.0, "Tom")
    println(pair.first)
    println(pair.second)

    val pair3 = 3.0 to "Bill"
    val (id3, name3) = pair3
    println("person: $name3, id: $id3")

    // destructure
    val (id, name) = pair
    println("person: $name, id: $id")

    // copy function
    val pair2 = pair.copy(first=2.0, second = "Jon")
    println("using copy function, pair first is now ${pair2.first}")
    println("using copy function, pair second is now ${pair2.second}")

    // Create a triple
    val triple1 = Triple(1.0, "Jo", "IT")
    val triple2 = 2.0 to "Sara" to "HR"
    println(triple1)
    println(triple1.javaClass)
    println(triple2.javaClass)
}
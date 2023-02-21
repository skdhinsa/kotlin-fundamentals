package Collections

/*
    unordered, distinct list of elements.
    can find elements faster than in a list.
    Use: when we don't care about order and want no duplicates
 */

data class User(val name:String)

fun main() {

    // 1. create a list -> setOf()
    val someSet = setOf("A", "B", "C")
    println("my set: $someSet")

    val someOtherSet: Set<Int> = setOf(2,4,6)
    println("my set: $someOtherSet")

    val emptySet: Set<Char> = setOf()

    // 2. add elements to list
    println(someSet + "D")
    println(setOf("Z") + someSet)
    println(someSet + someOtherSet)

    // 3. size of list
    println("size of set: ${someSet.size}")
    println(someSet.size == 0)
    println(emptySet.size == 0)

    // 4. Elements in a set are unique - not added if exists
    println( someSet + "A") // ignored
    println( someSet + "D")

    val userSet = setOf(User("Amy"), User("Becky"), User("Amy"))
    println(userSet)

    // 5. check a set contains an element -> not by index, since unordered
    println(someSet.contains("D"))
    println("A" in someSet)
    println("D" !in someSet)
}
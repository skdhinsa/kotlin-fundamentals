package ScopeFunctions

/*
    Not extension functions -> context object is passed as an argument.
    Object is available using "this"
    with this object, do this
 */
fun main() {

//    exploreWith()
    exploreRun()
    exploreRunNoObject()
}

fun exploreRun() {
    /*
        same as with but invokes as let does - an extension
        good for -> lambda containing obj initialisation and computation of return val
     */
    var numbers: MutableList<Int>? = null
    val res = numbers.run {
        numbers = mutableListOf(1,2,3,4,5)
        numbers?.sum()
    }
    println(res)
}

fun exploreRunNoObject() {
    // good for arbitrary code to return some value
    val res = run {
        val name = "serena"
        name.uppercase()
    }
    println(res)
}

fun exploreWith() {
    val numbers = mutableListOf(1,2,3,4,5)
    var res = with(numbers) {
        println("before: $numbers")
        val newList = plus(6)
        println("after: $newList")
        newList.sum()
    }
    println("sum: $res")
}

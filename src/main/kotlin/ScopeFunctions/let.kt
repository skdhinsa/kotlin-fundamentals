package ScopeFunctions

/*
    let -> used to invoke one or more functions on results of call chains.
    return ->  result of the lambda
    If we want to transformation/computation the result of some REST/db call
 */
fun main() {

    exploreLet()
    exploreLetNullable()

}

fun exploreLet() {
    val nums = mutableListOf(1,2,3,4,5)
    val result = nums.map { it*3 }.filter { it>5 }.let {
        println(it)
        it.sum()
    }.also {
        println(it)
    }
    println("result of let+also: $result")
}

fun exploreLetNullable() {
    var name: String? = null
    name = "serena"
    // ensure null is handled for when methods are called. Hence, ? safety op
    var result = name?.let {
        println("original: $it")
        it.uppercase()
    }
    println("result nullable: $result")
}

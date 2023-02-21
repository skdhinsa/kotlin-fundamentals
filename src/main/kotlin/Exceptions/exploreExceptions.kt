package Exceptions

fun main() {

    println("Name length ${nameLength("Serena")}")
    println("Name length ${nameLength("")}")
    println("Name length ${nameLength(null)}")
}

fun nameLength(name: String?): Int? {
    return try {
        name!!.length
    } catch (ex: Exception){
        println(ex.message)
        null
    }
}

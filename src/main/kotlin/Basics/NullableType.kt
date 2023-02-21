package Basics

/*
    Kotlin design is to avoid errors due to null values
 */

class User(val name: String)

fun printUserName(user: User?){
    val userWithDefault: User = user ?: User("undefined")
    println(userWithDefault.name)
}

fun main() {
    //safe call, calls right side(method) if left side is not null
    var message: String? = "Hello world"
    var length = message?.length
    println(length)
    message = null
    println(message?.length)

    // Elvis operator to provide default value if null -> ?:
    val user1 = User("John")
    printUserName(user1)
    printUserName(null)
}
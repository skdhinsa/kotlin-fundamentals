package Basics

fun main() {
    /*
        When-statement instead of if-else-if

        when {
            condition1 -> {
                body1() // executed if condition1
            }
            condition2 -> {
                body2() // executed if condition1
            }
     */
    val name:String = "Admin"
    when{
        name.lowercase().equals("admin") -> {
            println("You are logged in as admin account")
        }
    }

    // useful for validation
    val password = "password"
    var textToShow = when {
        password == "" -> "password is empty"
        password.length < 8 -> "password is too short"
        else -> "password is ok"
    }
    println(textToShow)

    // when with a value
    var day = "Sunday"
    var textToShow2 = when (day.lowercase()) {
        "monday", "tuesday", "wednesday", "thursday", "friday" -> "delivery available"
        "saturday", "sunday" -> "no delivery on weekends"
        else -> "no day"
    }
    println(textToShow2)

    // when with a range check
    var number = 1
    var textToShow3 = when (number) {
        in 1..5 -> "number between 1 and 5"
        in 6..10 -> "no delivery on weekends"
        else -> "too big a number"
    }
    println(textToShow3)

    // when with type check
    val something: Any = 3.14F
    var showTypeOfText = when (something) {
        is String -> "is String"
        is Boolean -> "is Boolean"
        is Double -> "is Double"
        else -> "is ${something.javaClass}"
    }
    println(showTypeOfText)

}
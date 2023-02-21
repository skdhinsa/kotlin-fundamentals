package Exercises

fun main() {
    val weekday = "Monday"
    if (weekday.lowercase()=="monday"){
        println("Open 8 AM to 12 PM")
    } else if (weekday.lowercase()=="tuesday") {
        println("Open 8 AM to 6 PM")
    }

    val hour = 20
    val isOpen = when (weekday.lowercase()) {
        "monday","tuesday", "wednesday", "thursday" -> hour >= 8 && hour <=12
        "friday" -> hour in 9..17
        "saturday" -> hour in 9..21
        "sunday" -> false
        else -> false
    }

    if(isOpen) {
        println("Little Lemon is open now.")
    } else {
        println("Little Lemon is closed now.")
    }
}
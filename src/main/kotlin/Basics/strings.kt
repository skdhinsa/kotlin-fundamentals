package Basics

fun main(){
    val c: Char = 'A' // computer stores char to unicode A=65
    println(c.code)
    println("char to string: $c")

    var word: String = "word"
    println("length of $word "+word.length)
    val a = 23
    val b = 43
    println("sum of $a and $b is ${a+b}")

    // searching strings: Boolean
    val myString = "Hello, world"
    val endsWithWorld = myString.endsWith("world")
    println(endsWithWorld)
    val startsWith = myString.startsWith("H")
    println(startsWith)

    // get first and last char, or specific char
    println(myString.first())
    println(myString.last())
    println(myString[0])

    // get all characters from second char onwards
    println(myString.substring(1))
    println(myString.replace("Hello", "Hi"))

    // masking a card number - only keeping last 4 digits
    var cardNum = "1234-1234-1234-5555"
    var masked = "XXXX-XXXX-XXXX-"
    val maskedCard = masked+cardNum.subSequence(15,cardNum.length)
    println("masked card num: "+maskedCard)
}
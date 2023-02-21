package SpecialClasses

import java.lang.IllegalStateException
import java.lang.NumberFormatException

/*
 Exceptions: An unwanted event that breaks the standard flow of the program.
 When you try to make an illegal operation.

 Try-catch to catch an exception. Finally block is always invoked

 Any class that extends Throwable can be used as an exception.
 Can be thrown using a throw block.
 */

class myError :Throwable("some message")

fun someFunction(){
    throw myError()
    println("will not be printed")
}
var userName = ""
fun printUserName() {
    if(userName == "") throw IllegalStateException("username must not be empty")
}

fun main() {
    // throwable -> since exception is referred to as a throw statement
    try {
        val num: Int = "ABC".toInt()
        println(num)
    } catch (exception: NumberFormatException) { // can specify exception to catch or use Throwable class (supertype of all)
        println("caught $exception")
        print(exception.stackTrace)
    } catch (exception: ArithmeticException) {
        println("caught $exception")
    } catch (exception: Throwable) {
        println("caught $exception")
    } finally {
        println("always invoked!")
        // this is for operations that should always be done no matter what!
        // i.e. closing up connections or cleaning-up resources
    }

    try {
        someFunction()
        println("will not be printed")
    } catch (e: Throwable) {
        println("caught $e")
    }

    /*
        Important exceptions:
        IllegalArgumentException -> used when an argument has an incorrect value.
        IllegalStateException -> used when the state of our system is incorrect.
     */
    printUserName()
}

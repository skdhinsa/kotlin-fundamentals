package classes

import java.lang.IllegalArgumentException

// secondary constructor
class Item () {
    var name: String = "" // var since we will be overriding the value

    var price: Double = 0.0
    // Customer setter: use this if we need validation
    set(value) {
        println("inside setter")
        if(value>=0.0){
            field = value
        } else {
            throw IllegalArgumentException("Negative price not accepted")
        }
    }

    constructor(_name: String): this() {
        name = _name
    }

}

fun main() {
    val item = Item("iPhone")
    println("item name is ${item.name}")
    item.name = "samsung galaxy"
    println("item name is ${item.name}")

    val item2 = Item("google phone")
    item2.price = 1340.0
    println(item2.price)


}
package SpecialClasses

/*
    Enum -> represents set of possible values
    Better for validation purpose, prevents code from compiling if there were a typo for instance.
    Instead of using string values -> it limits the possible set of values, preventing errors
 */

enum class PaymentMethod {
    CASH,
    CARD,
    PAYPAL
}

// enum classes have a constructor
enum class PizzaValues (val slices: Int) {
    SMALL(8),
    MEDIUM(10),
    LARGE(12)
}

fun printNoOfPizzaSlices(pizza: PizzaValues){
    println("size ${pizza.name} has ${pizza.slices} slices")
}

fun payWithPaypal(amount: Double): Boolean {
    println("to pay with paypal, amount $amount")
    return true
}

fun payWithCash(amount: Double): Boolean {
    println("to pay in cash, amount $amount")
    return true
}

fun payWithCard(amount: Double): Boolean {
    println("to pay in card, amount $amount")
    return true
}

fun pay(amount: Double, method: PaymentMethod): Boolean {
    return when(method) {
        PaymentMethod.PAYPAL -> payWithPaypal(amount)
        PaymentMethod.CASH -> payWithCash(amount)
        PaymentMethod.CARD -> payWithCard(amount)
    }
}

fun main() {

    println(PaymentMethod.CASH.ordinal) // position in the enum declaration i.e 0

    pay(14.00, PaymentMethod.PAYPAL)

    // iterate through the enum values
    for(method in PaymentMethod.values()){
        println("${method.name}, position ${method.ordinal}")
    }

    // string to enum, enum to string
    val stringCash = "CASH" // must match one of the enum value, else exception
    val method = PaymentMethod.valueOf(stringCash) // to enum value
    println(method)
    val string2: String = method.name // back to string

    // enum with constructor
    printNoOfPizzaSlices(PizzaValues.LARGE)

}
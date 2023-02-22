package Collections

import Dataset.PaymentMethods
import Dataset.transactionList
import classes.Transactions

fun main() {
    println(exploreGroupingByUsingSequence(transactionList()))
    println(exploreGroupingByUsingSequence2(transactionList()))
}

fun exploreGroupingByUsingSequence(transactionList: MutableList<Transactions>): Map<PaymentMethods, Int> {
    return transactionList
        .groupingBy {
            it.paymentMethod
        }
        .eachCount()
}

// return a Map<String, Int> where the keys are the card types and the values are the number of transactions with that card type
fun exploreGroupingByUsingSequence2(transactionList: MutableList<Transactions>): Map<String, Int> {
    return transactionList
        .asSequence()
        .groupingBy {
            // using a when expression to map the PaymentMethod to a String representing the card type
            when (it.paymentMethod) {
                // grouped VISA, MASTERCARD, AMEX under the key "CARD"
                PaymentMethods.VISA, PaymentMethods.MASTERCARD, PaymentMethods.AMEX -> "CARD"
                else -> it.paymentMethod.toString()
            }
        }
        .eachCount() // returns a Map of the counts of each element in the group.
}
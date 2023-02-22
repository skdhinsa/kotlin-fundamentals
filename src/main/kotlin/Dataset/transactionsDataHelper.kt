package Dataset

import classes.Transactions

enum class PaymentMethods{
    MASTERCARD,
    VISA,
    PAYPAL,
    CLEARPAY,
    GOOGLEPAY,
    AMEX,
    TRUSTLY
}

fun transactionList(): MutableList<Transactions> {

    return mutableListOf(
        Transactions(
            1, PaymentMethods.VISA, 12.00
        ),
        Transactions(
            2, PaymentMethods.PAYPAL, 22.00
        ),
        Transactions(
            3, PaymentMethods.VISA, 132.00
        ),
        Transactions(
            4, PaymentMethods.MASTERCARD, 56.00
        ),Transactions(
            5, PaymentMethods.VISA, 15.00
        ),
        Transactions(
            6, PaymentMethods.PAYPAL, 14.50
        ),
        Transactions(
            7, PaymentMethods.VISA, 16.99
        ),Transactions(
            8, PaymentMethods.MASTERCARD, 35.86
        ),Transactions(
            9, PaymentMethods.PAYPAL, 45.23
        ),Transactions(
            10, PaymentMethods.GOOGLEPAY, 36.50
        ),
    )
}

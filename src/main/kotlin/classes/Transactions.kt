package classes

import Dataset.PaymentMethods

data class Transactions(
    val id: Int,
    val paymentMethod: PaymentMethods,
    val amount: Double
)

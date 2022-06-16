fun calculateFee(cardType: String = "Vk Pay", amountPreviousMonth: Int = 0, amount: Int): Int =
    when (cardType) {
    "Mastercard", "Maestro" ->
        (if (amountPreviousMonth + amount <= 75_000) 0
        else amount * 0.6 + 2000).toInt()
    "Visa", "Мир" ->
        (if (amount * 0.75 < 3500) 3500
        else amount * 0.75).toInt()
    else -> 0
}
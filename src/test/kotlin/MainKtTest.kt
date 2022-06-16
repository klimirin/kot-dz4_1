import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateFeeMastercard() {
        val cardType = "Mastercard"
        val amountPreviousMonth = 0
        val amount = 1000
        val result = calculateFee(cardType, amountPreviousMonth, amount)
        assertEquals(0, result)
    }

    @Test
    fun calculateFeeMastercardMax() {
        val cardType = "Mastercard"
        val amountPreviousMonth = 80_000
        val amount = 1000
        val result = calculateFee(cardType, amountPreviousMonth, amount)
        assertEquals(2600, result)
    }

    @Test
    fun calculateFeeMaestro() {
        val cardType = "Maestro"
        val amountPreviousMonth = 0
        val amount = 1000
        val result = calculateFee(cardType, amountPreviousMonth, amount)
        assertEquals(0, result)
    }

    @Test
    fun calculateFeeMaestroMax() {
        val cardType = "Maestro"
        val amountPreviousMonth = 80_000
        val amount = 1000
        val result = calculateFee(cardType, amountPreviousMonth, amount)
        assertEquals(2600, result)
    }

    @Test
    fun calculateFeeVisa() {
        val cardType = "Visa"
        val amountPreviousMonth = 0
        val amount = 1000
        val result = calculateFee(cardType, amountPreviousMonth, amount)
        assertEquals(3500, result)
    }

    @Test
    fun calculateFeeVisaMax() {
        val cardType = "Visa"
        val amountPreviousMonth = 0
        val amount = 10000
        val result = calculateFee(cardType, amountPreviousMonth, amount)
        assertEquals(7500, result)
    }

    @Test
    fun calculateFeeMir() {
        val cardType = "Мир"
        val amountPreviousMonth = 0
        val amount = 1000
        val result = calculateFee(cardType, amountPreviousMonth, amount)
        assertEquals(3500, result)
    }

    @Test
    fun calculateFeeMirMax() {
        val cardType = "Мир"
        val amountPreviousMonth = 0
        val amount = 10000
        val result = calculateFee(cardType, amountPreviousMonth, amount)
        assertEquals(7500, result)
    }


    @Test
    fun calculateFeeVkPay() {
        val cardType = "Vk Pay"
        val amountPreviousMonth = 0
        val amount = 1000
        val result = calculateFee(cardType, amountPreviousMonth, amount)
        assertEquals(1, result)
    }

    @Test
    fun calculateFeeDefault() {
        val amount = 1000
        val result = calculateFee(amount=amount)
        assertEquals(0, result)
    }

}
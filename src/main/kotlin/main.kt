package ru.netology

const val COMMISSION_RATE = 0.0075
const val MINIMUM_COMMISSION = 35.0

fun main() {
    val amount = 5_020
    val commission =
        if ((amount * COMMISSION_RATE).toInt() >= MINIMUM_COMMISSION) (amount * COMMISSION_RATE).toInt() else MINIMUM_COMMISSION
    println("Перевод: $amount р.\nКомиссия: $commission р.")
}
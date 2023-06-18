package ru.netology

fun main(){
    val amount = 5_020
    val commission = if ((amount * 0.0075).toInt() >= 35) (amount * 0.0075).toInt() else 35
    println("Перевод: $amount р.\nКомиссия: $commission р.")
}
package Basics

import kotlin.text.toIntOrNull as toIntOrNull1

class AOwithIO {
}


fun main() {
    println("Write the first number on which you wan to perform the operations ")

    val no1 = readLine() ?.toIntOrNull1() ?:0
    println("Second number on which  you want to perform the operations")

    val no2 = readLine() ?.toIntOrNull1() ?:0


    val sum = no1 + no2

    println("sum equals to $sum")
    val difference = no1 - no2
    println("difference is equals to $difference")

    val product = no1 * no2
    println("product equals to $product")


    val quotient = no1.toDouble() / no2.toDouble()
    println("Quotient is $quotient")


    val remainder = no1 % no2
    println("remainder is equals to $remainder")



}
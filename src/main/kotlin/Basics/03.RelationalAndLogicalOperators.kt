package Basics
import kotlin.text.toIntOrNull as toIntOrNull1
class RelationalAndLogicalOperators {
}

fun main() {
    println("Write the first number on which you wan to perform the operations ")

    val a = readLine() ?.toIntOrNull1() ?:0
    println("Second number on which  you want to perform the operations")

    val b = readLine() ?.toIntOrNull1() ?:0



    //Relational operators
    println("relational operators")
    println("$a == $b is ${a == b }")
    println("$a != $b is ${a != b }")
    println("$a < $b is ${a < b }")
    println("$a > $b is ${a > b }")
    println("$a >= $b is ${a >= b }")

    //logical operators
    val x = true
    val y = false


    println("\nLogical operators:")
    println("$x &&  $y is ${x && y}")
    println("$x ||  $y is ${x || y}")
    println("!$x  is ${!x}")





}
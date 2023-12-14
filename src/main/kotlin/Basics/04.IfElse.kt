package Basics

class IfElse {


}


fun main() {
    println("Type the  number you want to test ")
    val number = readLine() ?.toIntOrNull() ?:0
    if(number % 2 == 0)
        println("the $number is even number")
    else{
        println("$number is odd number ")
    }
}
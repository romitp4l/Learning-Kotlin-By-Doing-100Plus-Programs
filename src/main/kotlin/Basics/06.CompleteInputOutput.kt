package Basics

fun main() {
    print("Enter your name :     ")
    val name = readLine()

    println("Hello, $name")


    print("Enter your age :")
    val age = readLine()?.toIntOrNull() ?: 0

    println("you are $age years old .")

}

class CompleteInputOutput {
}


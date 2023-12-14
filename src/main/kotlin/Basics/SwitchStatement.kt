package Basics

class SwitchStatement {
}

// In kotlin we use "when" keyword for switch keyword like behaviour

fun main() {
    println("type the number between 1 to 7 to get  the corresponging day of the week")
    val dayOfWeek = readLine() ?.toIntOrNull() ?: 0

    when(dayOfWeek) {
        1 -> {
            println("it's Monday")

        }

        2 -> {
            println("it's Tuesday")

        }

        3 -> {
            println("it's Wednesday")

        }

        in 4..6 -> {
            println("it's day between thrusday and saturday ")

        }

        7 -> {
            println("it's Sunday , the funday just enjoy hard ")
        }
    }
}
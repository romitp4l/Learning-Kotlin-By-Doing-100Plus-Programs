package Basics

class `Loops-ForWhileDoWhile` {
}

fun main() {
    println("Example using for looop")
    for ( i in 1..5){
        println("count : $i")

    }

    println("Example using while loop ")



    println("number fromwhich you want to start backcounting back to zero")
    var count = readLine() ?.toIntOrNull()?:0
    while ( count >= 0 ){
        println("backcounting : $count")
        count--
    }

    println("Example using do-while looop ")
    var number = 499
    do {
        println("number counting till thousand is $number ")
        number++
    }while (number <= 1000)

}
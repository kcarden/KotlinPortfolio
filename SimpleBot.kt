package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val age1 = scanner.nextInt() % 3
    val age2 = scanner.nextInt() % 5
    val age3 = scanner.nextInt() % 7
    val age = (age1 * 70 + age2 * 21 + age3 * 15) % 105    

    println("Your age is $age; that's a good time to start programming!")
}

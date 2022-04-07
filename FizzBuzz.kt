import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val n1 = input.nextInt()
    val n2 = input.nextInt()
    val f = "Fizz"
    val b = "Buzz"
    val fb = "FizzBuzz"
    for (i in n1..n2) {
        val ff = i % 3 == 0
        val bb = i % 5 == 0
        if (ff && bb) {
            println(fb)
        } else if (ff) {
            println(f)
        } else if (bb) {
            println(b)
        } else {
            println(i)
        }
    }
}

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val n = input.nextInt()
    val range = a..b
    var count = 0
    for (d in range) {
        if (d % n == 0) {
            ++count
        }
    }
    println(count)
}
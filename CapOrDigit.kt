import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val ch = input.next().first()
    val magicNumbers = ch in '1'..'9'
    val magicLetters = ch in 'A'..'Z'
    println(magicNumbers || magicLetters)
}
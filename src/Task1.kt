import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a number to convert: ")
    val n = scanner.nextInt()
    println("$n converted to Hexadecimal: ${n.toHexString()}")
}

fun Int.toHexString() = Integer.toHexString(this).toUpperCase()


import java.math.BigInteger
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a Hexadecimal string: ")
    val s = scanner.next()
    println("$s converted to Binary String: ${s.toBinaryString()}")
}

fun String.toBinaryString(): String = Integer.toBinaryString(Integer.parseInt(this, 16))



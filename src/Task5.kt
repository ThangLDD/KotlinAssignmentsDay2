import java.lang.Exception
import java.math.BigInteger
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var s: String
    do {
        print("Enter a string contains 12-19 numeric characters: ")
        s = scanner.next()
    } while ((s.length !in 12..19) || !checkDigit(s))

    if (checkLuhn(s)) {
        print("This is ${checkType(s)}")
    } else {
        print("This string is invalid")
    }
}

fun checkDigit(s: String): Boolean {
    for (i in s.indices) {
        if (s[i] !in '0'..'9') {
            return false
        }
    }
    return true
}

fun checkLuhn(s: String): Boolean {
    val n = s.length
    var sum = 0
    var isSecond = false

    for (i in n - 1 downTo 0) {
        var tmp = s[i] - '0'
        if (isSecond) {
            tmp *= 2
        }
        sum += tmp / 10
        sum += tmp % 10
        isSecond = !isSecond
    }
    return (sum % 10 == 0)
}

fun checkType(s: String): String {
    return if (s.startsWith('4')) {
        "VISA Card"
    } else if (s.substring(0, 2).toIntOrNull() in 50..69 || s.substring(0, 4).toIntOrNull() in 2221..2720) {
        "Master Card"
    } else if (s.substring(0, 4).toIntOrNull() in 3528..3589) {
        "JCB Card"
    } else {
        "Unknown Card"
    }
}


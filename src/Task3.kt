import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var s: String
    do {
        print("Enter a 4-byte string: ")
        s = scanner.next()
    } while (s.length != 8)

    println("String after turn-off B2b3: ${s.turnOffB2b3()}")
}

fun String.turnOffB2b3(): String {
    val sBinary = this.substring(3, 4).toBinaryString().reversed()
    var tmp = ""
    for (i in sBinary.indices) {
        tmp += if (i == 2) {
            '0'
        } else {
            sBinary[i]
        }
    }
    val sDecimal = Integer.toHexString(Integer.valueOf(tmp.reversed(), 2)).toUpperCase()
    return this.substring(0, 3) + sDecimal + this.substring(4, 8)
}

fun main() {
    print("Enter an IPv4 address: ")
    val ip = readlnOrNull() ?: ""

    if (isValidIPv4(ip)) {
        println("$ip is a valid IPv4 address.")
    } else {
        println("$ip is NOT a valid IPv4 address.")
    }
}

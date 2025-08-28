import kotlin.math.sqrt
fun main() {
    val numbers = listOf(1, 2, 4, 7, 13, 9, 23)

    // map applies the isPrime function to each element of the list
    val result = numbers.map { isPrime(it) }

    println("Numbers: $numbers")
    println("Are they prime? : $result")
}

/*
TODO: Function that checks if a number is prime
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

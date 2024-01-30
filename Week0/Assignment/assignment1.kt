import kotlin.random.Random

// Exercise 4. Conditions
fun main() {
    val randomNumber = Random.nextInt(-10, 10)

    println(randomNumber)

    when {
        randomNumber < 0 -> println("Negative")
        randomNumber > 0 -> println("Postive")
        else -> println("Zero")
    }
}
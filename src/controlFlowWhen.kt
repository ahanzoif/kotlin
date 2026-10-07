// When conditional control flow statement

fun main() {
    val animal = "Dog"
    when (animal) {
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("Animal is Unknown")
    }
}
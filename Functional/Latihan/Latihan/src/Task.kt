fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println("First letter is $firstChar and $lastChar for seconde letter")

}

// TODO 1
fun String.getFirstAndLast(): Map<String, Char> = mapOf("first" to this[0], "last" to this[this.lastIndex])
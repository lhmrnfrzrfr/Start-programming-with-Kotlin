// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenList = numberList.filter { it % 2 == 0 } // memfilter bilangan pada numberList yg habis dibagi 2
    val notEvenList = numberList.filterNot { it % 2 == 0 } // kebalikannya dari filter

    println(evenList)
    println(notEvenList)
}
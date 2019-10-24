// main function
fun main() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted() // mengurutkan data secara ascending (abjad)
    val descendingSort = kotlinChar.sortedDescending() // sebaliknya

    println(ascendingSort)
    println(descendingSort)
}
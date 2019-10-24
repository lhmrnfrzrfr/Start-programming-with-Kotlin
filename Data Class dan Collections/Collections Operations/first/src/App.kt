// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val moreThan10 = numberList.first { it > 9 }
    // menyaring item sebelum atau setelah dari sebuah numberList
    print(moreThan10)
}
// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(numberList.count()) // menghitung jumlah bilangan pada list
    println(numberList.count { it % 3 == 0 }) // menghitung berapa bilangan pada kelipatan 3
}
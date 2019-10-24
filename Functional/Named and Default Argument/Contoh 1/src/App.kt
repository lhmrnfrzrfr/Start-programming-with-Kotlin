// main function
fun main() {
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    print(fullName)
}

fun getFullName(first: String, middle: String, last: String): String { // mengubah isi value menjadi tipe data String
    return "$first $middle $last" // memanggil variable yg telah dijaidkan template
}
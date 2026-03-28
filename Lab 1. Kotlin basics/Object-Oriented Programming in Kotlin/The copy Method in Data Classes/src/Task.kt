data class Book(val title: String, val author: String, val price: Int)

fun applyDiscount(book: Book): Book {
    return book.copy(price = 150)
}

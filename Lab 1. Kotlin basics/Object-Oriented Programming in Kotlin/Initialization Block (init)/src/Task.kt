class Product(val price: Double) {
    init {
        require(price >= 0)
    }
}

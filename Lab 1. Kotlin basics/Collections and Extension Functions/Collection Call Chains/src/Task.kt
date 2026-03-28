fun processData(numbers: List<Int>): List<Int> {
    return numbers.filter { it > 0 }.map { it * 2 }
}

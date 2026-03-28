fun sumEvenNumbers(n: Int): Int {
    var sum = 0
    for (i in 0 until n step 2) {
        sum += i
    }
    return sum
}

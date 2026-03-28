fun countdown(start: Int): String {
    var result = ""
    for (i in start downTo 1) {
        result += "$i "
    }
    return result
}

fun processNames(names: List<String>): String {
    var result = ""
    names.forEach { result += "$it, " }
    return result
}

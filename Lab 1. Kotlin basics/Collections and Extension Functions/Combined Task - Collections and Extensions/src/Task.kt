fun List<String>.getImportantWords(): List<String> {
    return filter { it.startsWith("K") }.map { it.uppercase() }
}

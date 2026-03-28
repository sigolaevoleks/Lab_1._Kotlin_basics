fun processInput(input: Any): Int {
    return when (input) {
        is String -> input.length
        is Int -> input * 2
        else -> 0
    }
}

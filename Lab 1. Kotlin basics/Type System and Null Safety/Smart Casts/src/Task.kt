fun toUpperCaseSafe(text: String?): String {
    return if (text != null) {
        text.uppercase()
    } else {
        "EMPTY"
    }
}

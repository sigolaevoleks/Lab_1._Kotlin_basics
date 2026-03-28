fun MyText(text: String, color: String = "Black", fontSize: Int = 14): String {
    return "Text: $text, Color: $color, Size: $fontSize"
}

fun callText(): String {
    return MyText(text = "Compose", fontSize = 24)
}

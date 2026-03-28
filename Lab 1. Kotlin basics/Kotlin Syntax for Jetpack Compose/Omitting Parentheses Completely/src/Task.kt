fun Column(content: () -> String): String = "Col:\n  ${content()}"

fun drawColumn(): String {
    return Column { "Item" }
}

fun Row(modifier: String, content: () -> String): String = "Row($modifier) { ${content()} }"

fun buildUI(): String {
    return Row("Fill") { "Child" }
}

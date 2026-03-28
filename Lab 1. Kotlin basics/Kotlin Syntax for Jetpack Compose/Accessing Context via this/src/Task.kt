class ColumnScope(val name: String = "ColScope")
fun Column(content: ColumnScope.() -> String): String = ColumnScope().content()

fun getName(): String {
    return Column { this.name }
}

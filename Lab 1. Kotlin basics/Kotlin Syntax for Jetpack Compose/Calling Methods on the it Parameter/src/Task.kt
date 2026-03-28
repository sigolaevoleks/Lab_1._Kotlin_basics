fun clickable(action: (String) -> String): String = action("click")

fun addClick(): String {
    return clickable { it.uppercase() }
}
